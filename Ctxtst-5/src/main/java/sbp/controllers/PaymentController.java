package sbp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sbp.models.Payment;
import sbp.proxy.PaymentProxy;

@RestController
public class PaymentController {
	private final PaymentProxy paymentProxy;
	
	public PaymentController(PaymentProxy paymentProxy) {
		this.paymentProxy = paymentProxy;
	}
	
	
	@PostMapping("/payment")
	public Payment createPayment(
			@RequestBody Payment payment
			) {
		return paymentProxy.createPayment(payment);
		
		
	}
	

}

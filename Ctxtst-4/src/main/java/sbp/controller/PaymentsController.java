package sbp.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sbp.models.Payment;
import sbp.proxy.PaymentProxy;

@RestController
public class PaymentsController {
	
	private final PaymentProxy paymentProxy;
	
	public PaymentsController(PaymentProxy paymentProxy) {
		this.paymentProxy = paymentProxy;
	}
	
	@PostMapping("/payment")
	public Payment createPayment(
			@RequestBody Payment payment
			) {
		String requirdId = UUID.randomUUID().toString();
		return paymentProxy.createPayment(requirdId, payment);
		
	}

}

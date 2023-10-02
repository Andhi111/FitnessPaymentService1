package com.example.FitnessPaymentService1.controller;

import com.example.FitnessPaymentService1.kafka.PaymentProducer;
import com.example.FitnessPaymentService1.model.PaymentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// PaymentController.java
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentProducer paymentProducer;

    @PostMapping("/process")
    public ResponseEntity<String> processPayment(@RequestBody PaymentRequest paymentRequest) {
        paymentProducer.sendPaymentRequest(paymentRequest);
        return ResponseEntity.ok("PROCESSING");
    }
}

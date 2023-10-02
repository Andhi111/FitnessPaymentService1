package com.example.FitnessPaymentService1.kafka;

import com.example.FitnessPaymentService1.model.PaymentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

// PaymentProducer.java
@Component
public class PaymentProducer {
    @Autowired
    private KafkaTemplate<String, PaymentRequest> kafkaTemplate;

    @Value("${kafka.topic.payment}")
    private String paymentTopic;

    public void sendPaymentRequest(PaymentRequest paymentRequest) {
        kafkaTemplate.send(paymentTopic, paymentRequest);
    }
}

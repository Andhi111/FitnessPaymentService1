package com.example.FitnessPaymentService1.model;

import java.math.BigDecimal;

public class PaymentRequest {
    private String creditCardNumber;
    private String cvv;
    private String cardHolderName;
    private BigDecimal amount;

    public PaymentRequest() {
    }
}

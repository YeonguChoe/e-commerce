package com.yeonguchoe.backend;

public class OrderService {
    private PaymentService paymentService;

    // Dependency injection
    public OrderService() {
        // this.paymentService = paymentService;
    }

    public void placeOrder() {
        this.paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}

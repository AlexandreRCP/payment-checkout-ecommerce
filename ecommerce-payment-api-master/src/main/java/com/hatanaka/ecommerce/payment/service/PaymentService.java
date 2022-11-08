package com.alexandre.ecommerce.payment.service;

import com.alexandre.ecommerce.checkout.event.CheckoutCreatedEvent;
import com.alexandre.ecommerce.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}

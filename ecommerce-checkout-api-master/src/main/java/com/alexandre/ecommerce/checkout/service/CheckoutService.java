package com.alexandre.ecommerce.checkout.service;

import com.alexandre.ecommerce.checkout.entity.CheckoutEntity;
import com.alexandre.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}

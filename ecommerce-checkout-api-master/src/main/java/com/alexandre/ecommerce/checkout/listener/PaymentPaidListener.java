package com.alexandre.ecommerce.checkout.listener;

import com.alexandre.ecommerce.checkout.entity.CheckoutEntity;
import com.alexandre.ecommerce.checkout.service.CheckoutService;
import com.alexandre.ecommerce.checkout.streaming.PaymentPaidSink;
import com.alexandre.ecommerce.payment.event.PaymentCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {

    private final CheckoutService checkoutService;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent paymentCreatedEvent) {
        checkoutService.updateStatus(paymentCreatedEvent.getCheckoutCode().toString(), CheckoutEntity.Status.APPROVED);
    }
}

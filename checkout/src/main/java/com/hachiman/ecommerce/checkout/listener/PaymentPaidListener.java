package com.hachiman.ecommerce.checkout.listener;

import com.hachiman.ecommerce.checkout.entity.CheckoutEntity;
import com.hachiman.ecommerce.checkout.repository.CheckoutRepository;
import com.hachiman.ecommerce.checkout.service.CheckoutService;
import com.hachiman.ecommerce.payment.event.PaymentCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {
    private final CheckoutRepository checkoutRepository;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent event) {
        final CheckoutEntity checkoutEntity = checkoutRepository.findByCode(event
            .getCheckoutCode().toString()
        ).orElseThrow();

        checkoutEntity.setStatus(CheckoutEntity.Status.APPROVED);
        checkoutRepository.save(checkoutEntity);
    }
}

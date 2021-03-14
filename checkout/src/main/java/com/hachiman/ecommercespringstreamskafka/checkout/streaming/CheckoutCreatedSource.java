package com.hachiman.ecommercespringstreamskafka.checkout.streaming;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CheckoutCreatedSource {
    String OUTPUT = "checkout-created-output";

    @Output(CheckoutCreatedSource.OUTPUT)
    MessageChannel output();

}

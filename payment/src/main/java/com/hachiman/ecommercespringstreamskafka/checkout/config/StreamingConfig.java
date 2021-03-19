package com.hachiman.ecommercespringstreamskafka.payment.config;

import com.hachiman.ecommercespringstreamskafka.payment.streaming.CheckoutProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutProcessor.class
})
public class StreamingConfig {
}
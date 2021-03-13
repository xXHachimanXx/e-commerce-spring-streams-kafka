package com.hachiman.ecommercespringstreamskafka.checkout.service;

import com.hachiman.ecommercespringstreamskafka.checkout.entity.CheckoutEntity;
import com.hachiman.ecommercespringstreamskafka.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {
    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);


}

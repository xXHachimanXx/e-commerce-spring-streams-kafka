package com.hachiman.ecommerce.checkout.service;

import com.hachiman.ecommerce.checkout.entity.CheckoutEntity;
import com.hachiman.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {
    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);


}

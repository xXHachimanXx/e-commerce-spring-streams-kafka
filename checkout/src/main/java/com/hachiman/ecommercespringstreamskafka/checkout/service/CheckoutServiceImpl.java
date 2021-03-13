package com.hachiman.ecommercespringstreamskafka.checkout.service;

import com.hachiman.ecommercespringstreamskafka.checkout.entity.CheckoutEntity;
import com.hachiman.ecommercespringstreamskafka.checkout.repository.CheckoutRepository;
import com.hachiman.ecommercespringstreamskafka.checkout.resource.checkout.CheckoutRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CheckoutServiceImpl implements CheckoutService {
    private final CheckoutRepository checkouRepository = null;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {

        return Optional.empty();
    }
}

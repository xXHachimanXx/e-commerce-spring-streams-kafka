package com.hachiman.ecommercespringstreamskafka.checkout.service;

import com.hachiman.ecommercespringstreamskafka.checkout.entity.CheckoutEntity;
import com.hachiman.ecommercespringstreamskafka.checkout.repository.CheckoutRepository;
import com.hachiman.ecommercespringstreamskafka.checkout.resource.checkout.CheckoutRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor // Cria construtor para todos os atributos final
public class CheckoutServiceImpl implements CheckoutService {

    private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create(@RequestBody CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .status(CheckoutEntity.Status.CREATED)
                .build();

        return Optional.of(checkoutRepository.save(checkoutEntity));
    }
}

package com.hachiman.ecommercespringstreamskafka.checkout.resource.checkout;

import com.hachiman.ecommercespringstreamskafka.checkout.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

    private final CheckoutService checkoutService;

    @PostMapping("/")
    public ResponseEntity<CheckoutRequest> create(CheckoutRequest checkoutRequest) {

        checkoutService.create(checkoutRequest);

        return ResponseEntity.ok().build();
    }
}

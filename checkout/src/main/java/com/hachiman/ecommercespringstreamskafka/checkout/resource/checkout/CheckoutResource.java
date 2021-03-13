package com.hachiman.ecommercespringstreamskafka.checkout.resource.checkout;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

    @PostMapping("/")
    public ResponseEntity<CheckoutRequest> create(@RequestBody CheckoutRequest checkoutRequest) {

        return ResponseEntity.status(HttpStatus.CREATED).body(checkoutRequest);
    }
}

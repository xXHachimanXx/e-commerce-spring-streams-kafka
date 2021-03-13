package com.hachiman.ecommercespringstreamskafka.checkout.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CheckoutEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String code;


}

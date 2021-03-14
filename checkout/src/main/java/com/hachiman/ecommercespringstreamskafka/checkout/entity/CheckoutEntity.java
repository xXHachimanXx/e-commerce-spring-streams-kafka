package com.hachiman.ecommercespringstreamskafka.checkout.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CheckoutEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String code;


}

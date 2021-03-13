package com.hachiman.ecommercespringstreamskafka.checkout.repository;

import com.hachiman.ecommercespringstreamskafka.checkout.entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckoutEntity, Long> {

}

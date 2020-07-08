package com.sda.springboothw1.repository;

import com.sda.springboothw1.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author StanislavR
 */
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
    Purchase findByItem(String item);

    List<Purchase> findByValueGreaterThan(Long value);


}

package com.sda.springboothw1.service;

import com.sda.springboothw1.model.Purchase;

import java.util.List;

/**
 * @author StanislavR
 */
public interface PurchaseService {

    void save(Purchase purchase);
    List<Purchase> findAll();
    List<Purchase> findAllExpensive();

    Purchase findByItem(String item);

}

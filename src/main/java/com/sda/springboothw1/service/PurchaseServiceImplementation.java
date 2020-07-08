package com.sda.springboothw1.service;

import com.sda.springboothw1.model.Purchase;
import com.sda.springboothw1.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author StanislavR
 */
@Service("purchaseService")
@Transactional
public class PurchaseServiceImplementation implements PurchaseService {

    private PurchaseRepository repository;

    @Autowired
    public PurchaseServiceImplementation(PurchaseRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Purchase purchase) {
        repository.save(purchase);
    }

    @Override
    public List<Purchase> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Purchase> findAllExpensive() {
        return repository.findByValueGreaterThan(4999L);
    }

    @Override
    public Purchase findByItem(String item) {
        return repository.findByItem(item);
    }
}

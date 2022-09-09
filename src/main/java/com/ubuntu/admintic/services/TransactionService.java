package com.ubuntu.admintic.services;

import com.ubuntu.admintic.entity.Transaction;
import com.ubuntu.admintic.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private TransactionRepository repository;
    public TransactionService(TransactionRepository repository){
        this.repository=repository;
    }
    public List<Transaction> getTransactionList(){
        return this.repository.findAll();
    }

    public Transaction createTransaction(Transaction newProfile){
        return this.repository.save(newProfile);
    }
}


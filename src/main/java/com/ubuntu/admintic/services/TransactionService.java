package com.ubuntu.admintic.services;

import com.ubuntu.admintic.entity.Enterprise;
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

    public void eliminarTransaction(Long id){
        repository.deleteById(id);
    }

    public Transaction verTransactionPorId(Long id){
        return repository.findById(id).get();
    }
    public void crearYActualizarTransaction(Transaction transaction){
        repository.save(transaction);
    }


}


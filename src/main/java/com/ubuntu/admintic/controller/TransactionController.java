package com.ubuntu.admintic.controller;

import com.ubuntu.admintic.entity.Profile;
import com.ubuntu.admintic.entity.Transaction;
import com.ubuntu.admintic.services.TransactionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TransactionController {

    TransactionService services;

    public TransactionController(TransactionService services){
        this.services=services;
    }

    @GetMapping("/transaction")
    public List<Transaction> TransactionList(){
        return this.services.getTransactionList();
    }

    @PostMapping("/transaction")
    public Transaction createTransaction(@RequestBody Transaction transaction){
        return this.services.createTransaction(transaction);
    }

    @GetMapping("/transaction/{id}")
    public String findTransaction(@PathVariable int id){
        return "";
    }

    @DeleteMapping("/transaction/{id}")
    public String deleteTransaction(@PathVariable int id){
        return "";
    }

    @PatchMapping("/transaction/{id}")
    public String updateTransaction(@PathVariable int id){
        return "";
    }
}

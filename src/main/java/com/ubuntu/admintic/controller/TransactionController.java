package com.ubuntu.admintic.controller;

import com.ubuntu.admintic.entity.Enterprise;
import com.ubuntu.admintic.entity.Profile;
import com.ubuntu.admintic.entity.Transaction;
import com.ubuntu.admintic.services.TransactionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String createTransaction(@RequestBody Transaction transaction){
        services.createTransaction(transaction);
        return "redirect:/ingresosEgresos";
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

    @GetMapping("/transaction/borrar/{id}")
    private String eliminarTransaccion(@PathVariable("id") Long id){
        services.eliminarTransaction(id);
        return "redirect:/ingresosEgresos";
    }

    @GetMapping("/transaction/editar/{id}")
    private String verTransactionPorId(@PathVariable("id") Long id, Model model){
        Transaction transaction = services.verTransactionPorId(id);
        model.addAttribute("transaction", transaction);
        return "ActualizarTransaction";
    }

    @PostMapping("/transaction/actualizar/{id}")
    private String editarTransaction(@PathVariable("id") Long id, Transaction transaction){
        services.crearYActualizarTransaction(transaction);
        return "redirect:/ingresosEgresos";
    }


    @GetMapping ("/ingresosEgresos")
    private String ingresosEgresos(Model model){
        model.addAttribute("transactions", services.getTransactionList());
        return "ingresosEgresos";
    }
    @GetMapping("/nuevoIngreso")
    private String nuevoIngreso(Transaction transaction){
        return "nuevoIngreso";
    }
}

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

   //desde aqui

    @GetMapping ("/ingresosEgresos")
    private String ingresosEgresos(Model model){
        List<Transaction> prueba = services.getTransactionList();
        int suma = 0;
        for (int i=0;i<prueba.size();i++) {
            suma += prueba.get(i).getAmount();
        }
        model.addAttribute("transactions", services.getTransactionList());
        model.addAttribute("suma",suma);
        return "ingresosEgresos";

    }

    @GetMapping("/nuevoIngreso")
    private String nuevoIngreso(Transaction transaction){
        return "nuevoIngreso";
    }

    @PostMapping("/transaction")
    public String createTransaction(Transaction transaction){
        services.createTransaction(transaction);
        return "redirect:/ingresosEgresos";
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
        return "actualizarIngresosEgresos";
    }

    @PostMapping("/transaction/actualizar/{id}")
    private String editarTransaction(@PathVariable("id") Long id, Transaction transaction){
        services.crearYActualizarTransaction(transaction);
        return "redirect:/ingresosEgresos";
    }

}


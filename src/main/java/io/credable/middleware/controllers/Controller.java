package io.credable.middleware.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.credable.middleware.data.external.transactions.TransactionData;
import io.credable.middleware.services.TransactionsService;
@RestController
@ResponseBody
public class Controller {
    @Autowired
    public TransactionsService service;
    
    public Controller(TransactionsService service) {
        this.service = service;
    }

    @PostMapping("query/{customerNumber}")
    public ResponseEntity<List<TransactionData>> queryTransactions (@PathVariable String customerNumber) {
        ResponseEntity<List<TransactionData>> getTrans = service.getTransactions(customerNumber);
        return getTrans;
    }
}

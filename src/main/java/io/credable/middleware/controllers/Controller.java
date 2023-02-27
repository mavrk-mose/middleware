package io.credable.middleware.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.soap.SoapFaultException;

import io.credable.middleware.Config.Config;
import io.credable.middleware.data.external.transactions.TransactionData;
import io.credable.middleware.Config.Client;

@RestController
public class Controller {
    
    @PostMapping("query/{customer_number}")
    public ResponseEntity<Object> queryTransactions (@PathVariable String customer_number) {
        try {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
            Client client = context.getBean(Client.class);
            List<TransactionData> response = client.getTransactions(customer_number);
                return 
                    new ResponseEntity<>(Map.of("Message", "fetched transactions successfully", 
                                                "Response", response), HttpStatus.OK);                                                               
        } catch (SoapFaultException e) {
            //handle exception
            return 
                new ResponseEntity<>("error fetching transactional data" + e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}

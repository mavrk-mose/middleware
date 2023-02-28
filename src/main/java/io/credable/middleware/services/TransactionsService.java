package io.credable.middleware.services;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ws.soap.SoapFaultException;

import io.credable.middleware.Config.Client;
import io.credable.middleware.Config.Config;
import io.credable.middleware.data.external.transactions.TransactionData;

@Service
public class TransactionsService {

    public ResponseEntity<List<TransactionData>> getTransactions (String customerNumber) {
        try {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
            Client client = context.getBean(Client.class);
            List<TransactionData> response = client.getTransactions(customerNumber);
            if (response != null) {
                return ResponseEntity.ok(response);  
            } else {
                return ResponseEntity.badRequest().build();
            }                                                               
        } catch (SoapFaultException e) {
            //handle exception
            throw new RuntimeException("failed to fetch SOAP");
        }
    }
    
}

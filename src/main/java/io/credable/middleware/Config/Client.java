package io.credable.middleware.Config;

import java.util.List;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import io.credable.middleware.data.external.transactions.TransactionData;
import io.credable.middleware.data.external.transactions.TransactionsRequest;
import io.credable.middleware.data.external.transactions.TransactionsResponse;

public class Client extends WebServiceGatewaySupport{

    public List<TransactionData> getTransactions(String customerNumber){
        TransactionsRequest request = new TransactionsRequest();
        request.setCustomerNumber(customerNumber);

        TransactionsResponse response = (TransactionsResponse) getWebServiceTemplate()
            .marshalSendAndReceive("https://trxapitest.credable.io/service/transaction-data", request);

        return response.getTransactions();    
    }
    
}

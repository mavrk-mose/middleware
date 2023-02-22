package io.credable.middleware.Config;

import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.saaj.SaajSoapMessage;


public class SoapInterceptor implements ClientInterceptor {

    private final String soapActionUri;

    public SoapInterceptor(String soapActionUri) {
        this.soapActionUri = soapActionUri;
    }


    @Override
    public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
        SaajSoapMessage request = (SaajSoapMessage) messageContext.getRequest();
        request.setSoapAction(this.soapActionUri);
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
       
        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
       
        return false;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Exception ex) throws WebServiceClientException {
       
        
    }
}
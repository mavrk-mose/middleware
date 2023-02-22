package io.credable.middleware.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;

import jakarta.xml.bind.JAXBException;

@Configuration
public class Config {
    //pass authentication to request payload
    @Bean
    Wss4jSecurityInterceptor securityInterceptor() {
        Wss4jSecurityInterceptor security = new Wss4jSecurityInterceptor();
        security.setSecurementActions("UsernameToken");
        security.setSecurementUsername("admin");
        security.setSecurementPassword("pwd123");
        security.setSecurementPasswordType("PasswordText");
        security.setSecurementMustUnderstand(true);
        return security;
    }

    @Bean
    Jaxb2Marshaller marshaller() throws JAXBException {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("io.credable.middleware.data.external.transactions");
        return marshaller;
    }

    @Bean
    Client client(Jaxb2Marshaller marshaller) {
        Client client = new Client();
        client.setDefaultUri("http://trxapitest.credable.io/service/transaction-data");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        ClientInterceptor[] interceptor = new ClientInterceptor[]{securityInterceptor(), new SoapInterceptor("")};
        client.setInterceptors(interceptor);
        return client;
    }
}

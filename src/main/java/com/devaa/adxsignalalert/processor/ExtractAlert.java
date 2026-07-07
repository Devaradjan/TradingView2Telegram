package com.devaa.adxsignalalert.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class ExtractAlert implements Processor{

    @Override
    public void process(Exchange exchange) throws Exception {
        String alertBody = exchange.getIn().getBody(String.class);
        exchange.getIn().setHeader("msg",alertBody);
    }
}

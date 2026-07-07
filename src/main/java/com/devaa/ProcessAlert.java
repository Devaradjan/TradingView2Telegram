package com.devaa;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class ProcessAlert  implements Processor{
    @Override
    public void process(Exchange exchange) throws Exception {
        String alertBody = exchange.getIn().getBody(String.class);
        exchange.getIn().setHeader("msg",alertBody);
    }
}

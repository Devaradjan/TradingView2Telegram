package com.devaa.adxsignalalert.routes;

import com.devaa.adxsignalalert.processor.ExtractAlert;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TradingViewRoute extends RouteBuilder {

    @Value("${telegram.bot.token}")
    String token;

    @Value("${telegram.chat.id}")
    String chatId;

    @Autowired
    ExtractAlert processAlert;

    @Override
    public void configure() {

        from("platform-http:tradingview?httpMethodRestrict=POST")
                .routeId("TradingViewAlertRoute")

                // Incoming request
                .log(LoggingLevel.INFO, "Webhook received from TradingView")
                .log(LoggingLevel.INFO, "Incoming JSON: ${body}")
                .process(processAlert)
                .setBody(constant(""))
                .toD("https://api.telegram.org/bot" + token + "/SendMessage?chat_id="+chatId+"&text=${header.msg}&bridgeEndpoint=true");
        //.process()
        //.toD();
    }
}
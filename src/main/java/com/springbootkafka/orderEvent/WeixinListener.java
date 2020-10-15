package com.springbootkafka.orderEvent;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author : huyan
 * @Desrciption : TO-DO
 * @date : 2020-08-23 11:52
 **/
@Component
public class WeixinListener {
    @Async
    @Order(1)
    @EventListener(OrderEvent.class)
    public void listenOper(OrderEvent event){
        System.out.println(Thread.currentThread() + "...微信监听到..." + event.getMessage()+ "......" + event.getSource());
    }
}

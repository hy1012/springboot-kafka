package com.springbootkafka.orderEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author : huyan
 * @Desrciption : 短信监听（异步执行）
 * @date : 2020-08-23 11:30
 **/
@Component
public class SmsListener implements ApplicationListener<OrderEvent> {
    @Override
    @Async
    public void onApplicationEvent(OrderEvent event) {
        System.out.println(Thread.currentThread() + "...短信监听到..." + event.getMessage()+ "......" + event.getSource());
    }
}

package com.springbootkafka.orderEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author : huyan
 * @Desrciption : 邮件监听
 * @date : 2020-08-23 11:31
 **/
@Component
public class EmailListener implements ApplicationListener<OrderEvent> {
    @Override
    @Async
    public void onApplicationEvent(OrderEvent event) {
        System.out.println(Thread.currentThread() + "...邮件监听到..." + event.getMessage()+ "......" + event.getSource());
    }
}

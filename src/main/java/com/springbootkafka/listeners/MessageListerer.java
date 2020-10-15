package com.springbootkafka.listeners;

import com.springbootkafka.listener.HyEvent;
import com.springbootkafka.listener.HyListener;
import org.springframework.stereotype.Component;

/**
 * @author : huyan
 * @Desrciption : 消息监听者
 * @date : 2020-10-14 22:17
 **/
@Component
public class MessageListerer extends HyListener {
    public MessageListerer(HyEvent event) {
        super(event);
    }

    @Override
    public void onEvent(HyEvent event) {
        System.out.println(event.getName());
    }
}

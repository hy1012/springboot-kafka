package com.springbootkafka.listeners;

import com.huyan.listener.HyEvent;
import org.springframework.stereotype.Component;

/**
 * @author : huyan
 * @Desrciption : 消息事件
 * @date : 2020-10-14 22:06
 **/
@Component
public class MessageEvent extends HyEvent {
    public MessageEvent() {
        super("messageEvent");
    }
}

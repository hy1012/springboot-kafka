package com.springbootkafka.orderEvent;

import org.springframework.context.ApplicationEvent;

/**
 * @author : huyan
 * @Desrciption : 定义订单事件
 * @date : 2020-08-23 11:27
 **/
public class OrderEvent extends ApplicationEvent {
    private String message;

    /**
     *
     * @param source
     * @param message
     */
    public OrderEvent(Object source,String message) {
        super(source);
        this.message = message;
    }

    public Object getSouce(){
        return super.getSource();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

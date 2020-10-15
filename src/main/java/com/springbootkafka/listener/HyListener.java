package com.springbootkafka.listener;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : huyan
 * @Desrciption : 监听者
 * @date : 2020-10-14 21:30
 **/
public abstract class HyListener {
    public HyListener(HyEvent event) {
        HyPublish.addListener(event,this);
    }

    public abstract void onEvent(HyEvent event);
}

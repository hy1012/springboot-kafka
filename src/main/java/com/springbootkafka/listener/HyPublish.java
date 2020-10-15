package com.springbootkafka.listener;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : huyan
 * @Desrciption : 事件发布类
 * @date : 2020-10-14 21:29
 **/
public final class HyPublish {
    private static Map<HyEvent, List<HyListener>> map = new ConcurrentHashMap();

    public static void addListener(HyEvent event, HyListener listener) {
        if(map.get(event) == null) {
            List<HyListener> lists = new Vector<>();
            lists.add(listener);
            map.put(event,lists);
        } else {
            map.get(event).add(listener);
        }
    }

    public static void publishEvent(HyEvent event){
        List<HyListener> lists = map.get(event);
        for (HyListener listener : lists) {
            new Thread(()->{
                listener.onEvent(event);
            }).start();
        }
    }
}

package com.springbootkafka.watch;

import java.util.Observable;
import java.util.Observer;

/**
 * @author : huyan
 * @Desrciption : 监听者
 * @date : 2020-10-09 01:16
 **/
public class Watcher implements Observer {

    public Watcher(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("statue changed：" + ((Watched) o).getData());
    }
}

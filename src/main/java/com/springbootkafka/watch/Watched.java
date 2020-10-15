package com.springbootkafka.watch;

import javafx.beans.InvalidationListener;

import java.util.Observable;
import java.util.Observer;

/**
 * @author : huyan
 * @Desrciption : 被监听者Watched
 * @date : 2020-10-09 01:12
 **/
public class Watched extends Observable {
    private String data = "";

    public String getData() {
        return data;
    }

    public void setData(String data) {

        if(!this.data.equals(data)){
            this.data = data;
            // 修改状态
            setChanged();
        }
        // 通知所有观察者
        notifyObservers();
    }
}

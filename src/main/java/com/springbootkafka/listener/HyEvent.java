package com.springbootkafka.listener;

/**
 * @author : huyan
 * @Desrciption : TO-DO
 * @date : 2020-10-14 21:29
 **/
public class HyEvent {

    private String name;

    public HyEvent() {
    }

    public HyEvent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof HyEvent) {
            return this.name.equals(((HyEvent) obj).getName());
        } else {
            return false;
        }
    }
}

package org.mryan.eventnicetest.test.event;

import org.mryan.eventnice.annotation.EventReceive;

/**
 * @description： IntegerListener
 * @Author MRyan
 * @Date 2021/10/8 23:01
 * @Version 1.0
 */
public class IntegerListener {

    private Integer lastMessage;

    @EventReceive
    public void listen(Integer integer) {
        lastMessage = integer;
        System.out.println("Integer Message:" + lastMessage);
    }

    public Integer getLastMessage() {
        return lastMessage;
    }
}
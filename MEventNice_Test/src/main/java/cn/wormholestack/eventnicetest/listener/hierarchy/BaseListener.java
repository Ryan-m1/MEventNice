package cn.wormholestack.eventnicetest.listener.hierarchy;

import cn.wormholestack.eventnice.annotation.EventReceive;

/**
 * @description： BaseListener
 * @Author MRyan
 * @Date 2021/10/10 15:00
 * @Version 1.0
 */
public class BaseListener extends AbstractListener {

    @EventReceive
    public void baseTask(String s) {
        System.out.println("do baseTask(" + s + ")");
    }
}

package com.xf._12_springboot_rabbitmq.compont;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 14:52 2019/10/10
 * @description :消息接收者
 */

@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        //用于告诉发送者消息已经收到了
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}



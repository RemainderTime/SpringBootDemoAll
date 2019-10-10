package com.xf._12_springboot_rabbitmq;

import com.xf._12_springboot_rabbitmq.Application;
import com.xf._12_springboot_rabbitmq.compont.Receiver;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 14:57 2019/10/10
 * @description :测试类
 */
@Component
public class Runner implements CommandLineRunner {

    private final RabbitTemplate rabbitTemplate;
    private final Receiver receiver;
    private final ConfigurableApplicationContext context;

    public Runner(Receiver receiver, RabbitTemplate rabbitTemplate,
                  ConfigurableApplicationContext context) {
        this.receiver = receiver;
        this.rabbitTemplate = rabbitTemplate;
        this.context = context;
    }

    /**
     * 消息发送
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(Application.queueName, "Hello from RabbitMQ!");
        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
        context.close();
    }

}


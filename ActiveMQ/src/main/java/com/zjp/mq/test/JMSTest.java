package com.zjp.mq.test;

import com.zjp.mq.consumer.ProxyJMSConsumer;

import com.zjp.mq.producer.MessageSenderProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 2017/6/3.
 */
public class JMSTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                new String[] {"classpath:/spring/applicationContext-jms.xml"});

//        ProxyJMSConsumer proxyJMSConsumer = (ProxyJMSConsumer) applicationContext
//                .getBean("messageReceiver");
//        proxyJMSConsumer.handleMessage("rwrwe");

        MessageSenderProvider messageSenderProvider = (MessageSenderProvider)applicationContext.getBean("messageSenderProvider");
        //System.out.println("初始化消息消费者");
    }

}
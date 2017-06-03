package com.zjp.mq.consumer;

/**
 * Created by root on 2017/6/3.
 */

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.*;

/**
 * JMS消费者
 *
 *
 * <p>
 * 消息题的内容定义
 * <p>
 * 消息对象 接收消息对象后： 接收到的消息体* <p>
 */
public class ProxyJMSConsumer extends AbstractReqRespConsumer {

//    public ProxyJMSConsumer() {
//
//    }
//
//    private JmsTemplate jmsTemplate;
//
//    public JmsTemplate getJmsTemplate() {
//        return jmsTemplate;
//    }
//
//    public void setJmsTemplate(JmsTemplate jmsTemplate) {
//        this.jmsTemplate = jmsTemplate;
//    }
//
//    /**
//     * 监听到消息目的有消息后自动调用onMessage(Message message)方法
//     */
//        public void recive(Destination destination) {
////        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
////                new String[] { "classpath:/spring/applicationContext-jms.xml" });
////
////        Destination destination = (Destination) applicationContext
////                .getBean("destination");
//
//        while (true) {
//
//            try {
//                TextMessage txtmsg = (TextMessage) jmsTemplate
//                        .receive(destination);
//                if (null != txtmsg) {
//                    System.out.println("[DB Proxy] " + txtmsg);
//                    System.out.println("[DB Proxy] 收到消息内容为: "
//                            + txtmsg.getText());
//                } else
//                    break;
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        }
//    }

//    public void onMessage(Message message) {
//        Destination destination = null;
//        try {
//            destination = message.getJMSDestination();
//        } catch (JMSException e) {
//            e.printStackTrace();
//        }
//        this.recive(destination);
//
//    }

    @Override
    public void handleMessage(String message) {

    }
}
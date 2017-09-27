package org.apache.rocketmq.test.yuan;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;
//import org.apache.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;

import java.util.List;

/**
 * Created by yuan on 2017/6/18.
 */
public class ConsumerOne {

    private static Logger logger = LoggerFactory.getLogger(ConsumerOne.class);


    public static void main(String[] args) throws MQClientException{

        logger.info("ConsumerOne is start");
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("QuickStartConsumer");
        consumer.setNamesrvAddr("127.0.0.1:9876");
        consumer.setInstanceName("QuickStartConsumer1");
        consumer.subscribe("QuickStart", "TagA");
        consumer.setConsumeMessageBatchMaxSize(10);
        //MessageModel.CLUSTERING 集群消费 :只能有一个消费者消费一次  ,MessageModel.BROADCASTING 广播模式 所有的消费者都会消费一次
//        consumer.setMessageModel(MessageModel.CLUSTERING);
//        consumer.setMessageModel(MessageModel.BROADCASTING);

        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs,
                                                            ConsumeConcurrentlyContext context) {
                for(Message msg:msgs){

                    logger.info(Thread.currentThread().getName() + " Receive New Messages: " + new String(msg.getBody())+", msgkey : "+msg.getKeys());
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

//        consumer.registerMessageListener(new MessageListenerOrderly() {
//
//            @Override
//            public ConsumeOrderlyStatus consumeMessage(List<MessageExt> msgs, ConsumeOrderlyContext context) {
//                for(Message msg:msgs){
//
//                    logger.info(Thread.currentThread().getName() + " Receive New Messages: " + new String(msg.getBody()));
//                }
//                return ConsumeOrderlyStatus.SUCCESS;
//            }
//        });

        consumer.start();
        logger.info("ConsumerOne Started.");


//        logger.info("Consumer is start");
//        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("QuickStartConsumer");
//        consumer.setNamesrvAddr("127.0.0.1:9876");
//        consumer.setInstanceName("QuickStartConsumer");
//        consumer.subscribe("simpleQueueTopic", "TagA");
//        consumer.setConsumeMessageBatchMaxSize(10);
//        //MessageModel.CLUSTERING 集群消费 :只能有一个消费者消费一次  ,MessageModel.BROADCASTING 广播模式 所有的消费者都会消费一次
//        consumer.setMessageModel(MessageModel.CLUSTERING);
//        consumer.registerMessageListener(new MessageListenerConcurrently() {
//            @Override
//            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs,
//                                                            ConsumeConcurrentlyContext context) {
//                for(Message msg:msgs){
//
//                    logger.info(Thread.currentThread().getName() + " Receive New Messages: " + new String(msg.getBody()));
//                }
//                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//            }
//        });
//        consumer.start();
//        logger.info("Consumer Started.");

    }

}

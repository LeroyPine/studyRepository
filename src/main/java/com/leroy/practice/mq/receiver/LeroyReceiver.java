/*

package com.leroy.practice.mq.receiver;

import com.alibaba.fastjson.JSONObject;
import com.leroy.practice.model.EvaluateStatusDto;
import com.leroy.practice.model.User;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class LeroyReceiver {    //消费者



    @RabbitListener( admin = "amqpAdmin",
            bindings = @QueueBinding(
                    key = "evaluate.status.ZRKIM",
                    value = @Queue(name = "leroy.test.ZRKIM"),
                    exchange = @Exchange(name = "crm.test", type = ExchangeTypes.TOPIC)
            ))
    public  void  process(EvaluateStatusDto msg){
        System.out.println(JSONObject.toJSONString(msg));
        System.out.println("Receiver:"+msg);
    }




    @RabbitListener( admin = "amqpAdmin",
            bindings = @QueueBinding(
                    key = "evaluate.status.LONGRENT_DAIKAN",
                    value = @Queue(name = "leroy.test.LONGRENT_DAIKAN"),
                    exchange = @Exchange(name = "crm.test", type = ExchangeTypes.TOPIC)
            ))
    public  void  process1(EvaluateStatusDto msg){
        System.out.println(JSONObject.toJSONString(msg));
        System.out.println("Receiver:"+msg);
    }




}

*/

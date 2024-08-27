package org.ud.kafka_springboot.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.ud.kafka_springboot.User;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    @KafkaListener(topics = "javaguides_json", groupId = "myGroup")
    public void receivedJsonMessage(User user){
        LOGGER.info(String.format("Json message received by the consumer -> %s", user.toString()));
    }
}

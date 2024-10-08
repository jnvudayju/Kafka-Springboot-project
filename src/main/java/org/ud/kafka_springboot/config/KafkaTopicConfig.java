package org.ud.kafka_springboot.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic javaGuidesTopics(){
        return TopicBuilder.name("javaguides")
                .build();
    }

    @Bean
    public NewTopic javaGuidesJsonTopics(){
        return TopicBuilder.name("javaguides_json")
                .build();
    }
}

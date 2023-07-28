package com.example.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfigTopic {

    public NewTopic javaguidesTopic(){
        // Not creating the .partitions()
        return TopicBuilder.name("SpringKafka")
                .build();
    }




}

package com.nutrition.workout.workoutservice.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class WorkoutProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String topic = "workout-topic"; // Your Kafka topic

    @Autowired
    public WorkoutProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send(topic, message);
    }
}

package com.nutrition.workout.workoutexecutionservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class WorkoutConsumerService {

    @KafkaListener(topics = "workout-topic", groupId = "workout-consumer-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
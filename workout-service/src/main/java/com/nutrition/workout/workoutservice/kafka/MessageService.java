package com.nutrition.workout.workoutservice.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private WorkoutProducerService workoutProducerService;

    public void start() {
        workoutProducerService.sendMessage("Workout Created!");
    }
}

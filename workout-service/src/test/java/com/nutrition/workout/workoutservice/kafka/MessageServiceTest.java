package com.nutrition.workout.workoutservice.kafka;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MessageServiceTest {

    @Autowired
    private WorkoutProducerService workoutProducerService;

    @Test
    public void test(){
        workoutProducerService.sendMessage("test workout");
    }

}
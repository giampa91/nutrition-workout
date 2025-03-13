package com.nutrition.workout.workoutexecutionservice;

import com.nutrition.workout.workoutexecutionservice.DTOs.ExerciseLogDTO;
import com.nutrition.workout.workoutexecutionservice.DTOs.WorkoutExecutionDTO;
import com.nutrition.workout.workoutexecutionservice.domain.ExerciseLog;
import com.nutrition.workout.workoutexecutionservice.domain.WorkoutExecution;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workout-execution")
public class WorkoutExecutionController {

    // Endpoint to start a workout execution
    @PostMapping("/start")
    public ResponseEntity<WorkoutExecutionDTO> startWorkout(@RequestBody WorkoutExecutionDTO workoutExecution) {
        // Call the service to start a workout
        return ResponseEntity.status(HttpStatus.OK).body(new WorkoutExecutionDTO());
    }

    // Endpoint to finish a workout execution
    @PostMapping("/finish/{id}")
    public ResponseEntity<WorkoutExecutionDTO> finishWorkout(@PathVariable Long id) {
        // Call the service to finish the workout
        return ResponseEntity.status(HttpStatus.OK).body(new WorkoutExecutionDTO());
    }

    // Endpoint to log an exercise in a workout execution
    @PostMapping("/log-exercise/{executionId}")
    public ResponseEntity<WorkoutExecutionDTO> logExercise(
            @PathVariable Long executionId,
            @RequestBody ExerciseLogDTO exerciseLog) {
        // Call the service to log the exercise
        return ResponseEntity.status(HttpStatus.OK).body(new WorkoutExecutionDTO());
    }

    // Endpoint to get the workout execution by ID
    @GetMapping("/{id}")
    public ResponseEntity<WorkoutExecutionDTO> getWorkoutExecution(@PathVariable Long id) {
        // Call the service to retrieve the workout execution
        return ResponseEntity.status(HttpStatus.OK).body(new WorkoutExecutionDTO());
    }
}


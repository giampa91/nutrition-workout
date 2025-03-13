package com.nutrition.workout.workoutexecutionservice;

import com.nutrition.workout.workoutexecutionservice.DTOs.WorkoutExecutionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("workout/api/v1/workout-executions")
public class WorkoutExecutionController {


    // Create a new workout execution
    @PostMapping
    public ResponseEntity<WorkoutExecutionDTO> createWorkoutExecution(@RequestBody WorkoutExecutionDTO workoutExecutionDTO) {
        WorkoutExecutionDTO workoutExecution = new WorkoutExecutionDTO();
        return ResponseEntity.status(HttpStatus.CREATED).body(workoutExecution);
    }

    // Get a specific workout execution by ID
    @GetMapping("/{id}")
    public ResponseEntity<WorkoutExecutionDTO> getWorkoutExecution(@PathVariable Long id) {
        WorkoutExecutionDTO workoutExecution = new WorkoutExecutionDTO();
        return ResponseEntity.status(HttpStatus.CREATED).body(workoutExecution);
    }

    // Update an existing workout execution
    @PutMapping("/{id}")
    public ResponseEntity<WorkoutExecutionDTO> updateWorkoutExecution(
            @PathVariable Long id, @RequestBody WorkoutExecutionDTO workoutExecutionDTO) {
        WorkoutExecutionDTO workoutExecution = new WorkoutExecutionDTO();
        return ResponseEntity.status(HttpStatus.CREATED).body(workoutExecution);
    }

    // Delete a workout execution
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorkoutExecution(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
package com.nutrition.workout.workoutservice;

import com.nutrition.workout.workoutservice.DTOs.WorkoutProgramDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("workout/api/v1/workout-programs")
public class WorkoutProgramController {

    // Create a new workout program
    @PostMapping
    public ResponseEntity<WorkoutProgramDTO> createWorkoutProgram(@RequestBody WorkoutProgramDTO workoutProgramDTO) {
        // Logic for creating a workout program would go here (e.g., save to DB)
        WorkoutProgramDTO createdWorkoutProgram = new WorkoutProgramDTO(); // Replace with actual logic
        return ResponseEntity.status(HttpStatus.CREATED).body(createdWorkoutProgram);
    }

    // Get a specific workout program by ID
    @GetMapping("/{id}")
    public ResponseEntity<WorkoutProgramDTO> getWorkoutProgram(@PathVariable Long id) {
        // Logic to fetch workout program by ID would go here
        WorkoutProgramDTO workoutProgram = new WorkoutProgramDTO(); // Replace with actual logic
        return ResponseEntity.status(HttpStatus.OK).body(workoutProgram);
    }

    // Update an existing workout program
    @PutMapping("/{id}")
    public ResponseEntity<WorkoutProgramDTO> updateWorkoutProgram(
            @PathVariable Long id, @RequestBody WorkoutProgramDTO workoutProgramDTO) {
        // Logic to update a workout program would go here
        WorkoutProgramDTO updatedWorkoutProgram = new WorkoutProgramDTO(); // Replace with actual logic
        return ResponseEntity.status(HttpStatus.OK).body(updatedWorkoutProgram);
    }

    // Delete a workout program
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorkoutProgram(@PathVariable Long id) {
        // Logic to delete workout program by ID would go here
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
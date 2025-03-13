package com.nutrition.workout.workoutservice;

import com.nutrition.workout.workoutservice.DTOs.WorkoutProgramDTO;
import com.nutrition.workout.workoutservice.domain.WorkoutProgram;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("workout/api/v1/workout-programs")
public class WorkoutProgramController {

    @PostMapping
    public ResponseEntity<WorkoutProgram> createWorkoutProgram(@RequestBody WorkoutProgramDTO workoutProgramDTO) {
        // Create the workout program

        return ResponseEntity.ok().build();
    }

    @PostMapping("/{userId}/assign")
    public ResponseEntity<Void> assignWorkoutProgramToUser(
            @PathVariable Long userId, @RequestParam Long workoutProgramId) {
        // Assign the workout program to the user
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<WorkoutProgramDTO> getWorkoutProgramForUser(@PathVariable Long userId) {
        // Get the workout program assigned to this user
        return ResponseEntity.ok().build();
    }

    @GetMapping("/pt/{ptId}")
    public ResponseEntity<List<WorkoutProgramDTO>> getAllWorkoutProgramsForPT(@PathVariable Long ptId) {
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{workoutProgramId}")
    public ResponseEntity<WorkoutProgramDTO> updateWorkoutProgram(
            @PathVariable Long workoutProgramId, @RequestBody WorkoutProgramDTO workoutProgramDTO) {
        // Update the workout program
        return ResponseEntity.ok().build();
    }
}
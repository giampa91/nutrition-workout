package com.nutrition.workout.workoutexecutionservice;

import com.nutrition.workout.workoutexecutionservice.DTOs.ExerciseLogDTO;
import com.nutrition.workout.workoutexecutionservice.DTOs.WorkoutExecutionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.Map;


import java.util.List;

@RestController
@RequestMapping("/api/workout-execution")
public class WorkoutExecutionController {

    // In-memory storage to simulate database
    private final Map<Long, WorkoutExecutionDTO> workoutExecutionMap = new HashMap<>();
    private Long idCounter = 1L;

    // Start a workout execution
    @PostMapping("/start")
    public ResponseEntity<WorkoutExecutionDTO> startWorkout(@RequestBody WorkoutExecutionDTO workoutExecution) {
        workoutExecution.setId(idCounter++);
        workoutExecution.setStatus("Ongoing");
        workoutExecution.setStartDate(java.time.LocalDateTime.now());
        workoutExecutionMap.put(workoutExecution.getId(), workoutExecution);
        return ResponseEntity.status(HttpStatus.CREATED).body(workoutExecution);
    }

    // Finish a workout execution
    @PostMapping("/finish/{id}")
    public ResponseEntity<WorkoutExecutionDTO> finishWorkout(@PathVariable Long id) {
        WorkoutExecutionDTO workoutExecution = workoutExecutionMap.get(id);
        if (workoutExecution != null) {
            workoutExecution.setStatus("Done");
            workoutExecution.setEndDate(java.time.LocalDateTime.now());
            return ResponseEntity.status(HttpStatus.OK).body(workoutExecution);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    // Log an exercise in a workout execution
    @PostMapping("/log-exercise/{executionId}")
    public ResponseEntity<WorkoutExecutionDTO> logExercise(
            @PathVariable Long executionId,
            @RequestBody ExerciseLogDTO exerciseLog) {

        WorkoutExecutionDTO workoutExecution = workoutExecutionMap.get(executionId);
        if (workoutExecution != null) {
            List<ExerciseLogDTO> exerciseLogs = workoutExecution.getExerciseLogs();
            exerciseLogs.add(exerciseLog);
            workoutExecution.setExerciseLogs(exerciseLogs);
            return ResponseEntity.status(HttpStatus.OK).body(workoutExecution);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    // Get workout execution by ID
    @GetMapping("/{id}")
    public ResponseEntity<WorkoutExecutionDTO> getWorkoutExecution(@PathVariable Long id) {
        WorkoutExecutionDTO workoutExecution = workoutExecutionMap.get(id);
        if (workoutExecution != null) {
            return ResponseEntity.status(HttpStatus.OK).body(workoutExecution);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}

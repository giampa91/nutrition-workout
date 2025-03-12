package com.nutrition.workout.workoutservice.domain;

import com.nutrition.workout.workoutservice.DTOs.UserDTO;

import java.util.List;

public class WorkoutProgram {

    private Long id;
    private String name;
    private String description;
    private UserDTO pt; // Assuming PersonalTrainer is another class
    private List<UserDTO> assignedUsers; // List of users assigned to this workout
    private List<Exercise> exercises; // List of exercises in this program
    private Long createdAt;
    private Long updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserDTO getPt() {
        return pt;
    }

    public void setPt(UserDTO pt) {
        this.pt = pt;
    }

    public List<UserDTO> getAssignedUsers() {
        return assignedUsers;
    }

    public void setAssignedUsers(List<UserDTO> assignedUsers) {
        this.assignedUsers = assignedUsers;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }
}


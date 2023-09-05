package com.back.demo.model;

import jakarta.validation.constraints.*;
import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "The activity name cannot be null")
    @NotBlank(message = "The activity name cannot be blank")
    @Size(min = 1, max = 50, message = "The activity name must be between 1 and 50 characters")
    private String name;

    @NotNull(message = "The difficulty level cannot be null")
    @Min(value = 1, message = "Difficulty level must be equal to or greater than 1")
    @Max(value = 5, message = "Difficulty level must be equal to or less than 5")
    private Integer difficulty;

    // Relación con Signups
    @OneToMany(mappedBy = "activity")
    private List<Signup> signups;

}

package com.back.demo.model;
import jakarta.validation.constraints.*;
import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data
public class Signup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // La relación con Camper
    @ManyToOne
    @JoinColumn(name = "camper_id")
    private Camper camper;

    // La relación con Activity
    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    @NotNull(message = "The 'time' field must not be null.")
    @Min(value = 0, message = "The minimum value for 'time' must be 0.")
    @Max(value = 23, message = "The maximum value for 'time' should be 23.")
    private Integer time;
}
package com.back.demo.model;

import lombok.Data;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.List;

@Entity
@Data
public class Camper {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "The name cannot be null")
    @NotBlank(message = "The name cannot be blank")
    @Size(min = 1, max = 20, message = "The name must be between 1 and 20 characters")
    private String name;

    @NotNull(message = "The age cannot be null")
    @Min(value = 0, message = "Age must be equal to or greater than 0")
    private Integer age;
    @NotBlank(message = "The username cannot be null")
    @Size(min = 6, max = 20, message = "The username must be between 1 and 20 characters")
    private String username;
    @NotNull(message = "Password field should not be null.")
    @NotBlank(message = "Password field should not be empty.")
    @Size(min = 10, message = "Password should have at least 10 characters.")
    private String password;

    // La relación con Signups
    @OneToMany(mappedBy = "camper")
    private List<Signup> signups;

    public Camper(String name, Integer age, String username, String password) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public Camper() {

    }
}

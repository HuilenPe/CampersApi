package com.back.demo.dto;

import jakarta.validation.constraints.*;

public class CamperDTO {
    //@NotNull
    private Long id;
    @NotNull
    @NotBlank
    @Size(min = 1, max = 20)
    private String name;

    @NotNull
    @Min(0)
    private Integer age;

    @NotNull
    @NotBlank
    @Size(min = 6, max = 20)
    private String username;

    @NotNull
    @NotBlank
    @Size(min = 10)
    private String password;

    // Methods for all attributes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
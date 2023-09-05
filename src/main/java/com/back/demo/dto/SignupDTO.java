package com.back.demo.dto;

import jakarta.validation.constraints.*;

public class SignupDTO {
    @NotNull
    private Long camperId;

    @NotNull
    private Long activityId;

    @Min(value = 0)
    @Max(value = 23)
    private Integer time;
}
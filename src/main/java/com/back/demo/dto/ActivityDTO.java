package com.back.demo.dto;

import jakarta.validation.constraints.*;

public class ActivityDTO {
    private Long id;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 50)
    private String name;

    @NotNull
    @Min(value = 1)
    @Max(value = 5)
    private Integer difficulty;
}
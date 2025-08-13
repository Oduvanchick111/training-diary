package ru.boltinskiy.training_diary.user.dto;

import jakarta.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserResponseDto {
    private String userName;
    private String firstName;
}

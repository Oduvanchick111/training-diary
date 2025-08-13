package ru.boltinskiy.training_diary.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserRequestDto {
    @NotBlank
    private String userName;
    private String firstName;
    @NotNull
    private Long telegramId;
}

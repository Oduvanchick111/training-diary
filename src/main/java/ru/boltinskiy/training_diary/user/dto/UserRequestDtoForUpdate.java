package ru.boltinskiy.training_diary.user.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserRequestDtoForUpdate {
    @NotNull
    private Long id;
    private String userName;
    private String firstName;
}

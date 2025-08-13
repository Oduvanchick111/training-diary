package ru.boltinskiy.training_diary.user.service;

import ru.boltinskiy.training_diary.user.dto.UserRequestDto;
import ru.boltinskiy.training_diary.user.dto.UserRequestDtoForUpdate;
import ru.boltinskiy.training_diary.user.dto.UserResponseDto;
import ru.boltinskiy.training_diary.user.model.User;

import java.util.Collection;

public interface UserService {
    UserResponseDto createUser(UserRequestDto userRequestDto);

    UserResponseDto updateUser(Long userId, UserRequestDtoForUpdate userRequestDtoForUpdate);

    Collection<UserResponseDto> getAllUsers();

    UserResponseDto findUserById(Long userId);

    void deleteUser(Long userId);

    void deleteAllUsers();
}

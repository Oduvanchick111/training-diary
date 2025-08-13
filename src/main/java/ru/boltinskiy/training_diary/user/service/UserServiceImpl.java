package ru.boltinskiy.training_diary.user.service;

import ru.boltinskiy.training_diary.user.dto.UserRequestDto;
import ru.boltinskiy.training_diary.user.dto.UserRequestDtoForUpdate;
import ru.boltinskiy.training_diary.user.dto.UserResponseDto;

import java.util.Collection;
import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        return null;
    }

    @Override
    public UserResponseDto updateUser(Long userId, UserRequestDtoForUpdate userRequestDtoForUpdate) {
        return null;
    }

    @Override
    public Collection<UserResponseDto> getAllUsers() {
        return List.of();
    }

    @Override
    public UserResponseDto findUserById(Long userId) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Override
    public void deleteAllUsers() {

    }
}

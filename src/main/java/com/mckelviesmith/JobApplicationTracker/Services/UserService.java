package com.mckelviesmith.JobApplicationTracker.Services;

import com.mckelviesmith.JobApplicationTracker.DTOs.UserDto;
import com.mckelviesmith.JobApplicationTracker.Entities.User;
import com.mckelviesmith.JobApplicationTracker.Mappers.UserMapper;
import com.mckelviesmith.JobApplicationTracker.Repositories.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Handles logic for users
 */
@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;
  private final UserMapper userMapper;

  /**
   * Gets all users
   * @return all users as a list of UserDtos
   */
  public List<UserDto> getUsers() {
    List<User> userList = userRepository.findAll();
    return userMapper.userListToUserDtoList(userList);
  }


}

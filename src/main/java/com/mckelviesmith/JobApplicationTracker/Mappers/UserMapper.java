package com.mckelviesmith.JobApplicationTracker.Mappers;

import com.mckelviesmith.JobApplicationTracker.DTOs.UserDto;
import com.mckelviesmith.JobApplicationTracker.Entities.User;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * Handles mapping for Users
 * */
@Component
@AllArgsConstructor
public class UserMapper {

  private final ModelMapper mapper;

  /**
   * Maps a list of User entities to a list of UserDtos
   * @param userList list of user entities
   * @return list of UserDtos
   */
  public List<UserDto> userListToUserDtoList(List<User> userList) {
    return userList.stream()
        .map(user -> mapper.map(user, UserDto.class))
        .collect(Collectors.toList());
  }

}

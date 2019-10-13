package org.smartapps.converters;

import guru.springframework.domain.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.smartapp.entities.User;

@Mapper
public interface UserMapper {
    UserMapper USER_MAPPER = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user);
    User userCommandToUser(UserCommand userCommand);
}

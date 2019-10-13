package org.smartapp.controllers;

import guru.springframework.domain.UserCommand;
import org.smartapp.entities.User;
import org.smartapps.converters.UserMapper;

public class UserController {
    public User getUser(UserCommand userCommand) {
        return UserMapper.USER_MAPPER.userCommandToUser(userCommand);
    }
}

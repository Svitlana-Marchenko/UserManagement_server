package com.managment.usermanagment.exception;

import com.managment.usermanagment.model.User;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("No user with id "+id);
    }
}

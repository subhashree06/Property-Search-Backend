package com.property.propertysearch.service;

import com.property.propertysearch.model.User;
import com.property.propertysearch.model.UserRole;

import java.util.Set;

public interface UserService {
    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by username
    public User getUser(String userName);

    //delete user by id
    public void deleteUser(Long userId);
}

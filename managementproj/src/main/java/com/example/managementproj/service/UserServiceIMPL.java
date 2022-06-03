package com.example.managementproj.service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.example.managementproj.entity.UserInfo;

public interface UserServiceIMPL {
    
    public UserInfo getUser(Integer id) throws NotFoundException;

    public UserInfo createUser(UserInfo userInfo);

    public List<UserInfo> getUsers();

    public UserInfo updateUser(Integer id, UserInfo request) throws NotFoundException;
}


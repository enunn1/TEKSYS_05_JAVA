package com.example.managementproj.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.example.managementproj.entity.UserInfo;

public interface UserRepository extends JpaRepository <UserInfo, Long> {
    List<UserInfo> findAllByActiveOrderByIdDesc(boolean active);

    Optional<UserInfo> findByIdAndActive(Integer id, boolean active);
}
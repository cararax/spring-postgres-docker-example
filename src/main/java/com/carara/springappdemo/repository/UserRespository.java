package com.carara.springappdemo.repository;

import com.carara.springappdemo.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<UserModel, Long> {
}

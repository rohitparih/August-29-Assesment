package com.BookStore.Repo;


import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Integer> {

}
package com.company.employee.user;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MyUserRepository extends MongoRepository<MyUser, String> {
    Optional<MyUser> findByEmail(String email);
}

package com.company.employee.user;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(String id) {

        Optional<User> user = userRepository.findById(id);

        return user;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public User deleteUser(String id) {
        Optional<User> user = userRepository.findById(id);
        user.ifPresent(value -> userRepository.delete(value));
        return user.get();
    }

    public User findUserByEmail(String email) {
        Optional<User> user = userRepository.findByEmail(email);

        return user.orElseGet(user::get);

    }

    public void addUser(User user) {
        userRepository.save(user);
    }


}

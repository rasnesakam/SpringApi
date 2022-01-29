package com.springApi.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void add(User user){
        repository.save(user);
    }

    public void update(String id, User newUser){
        Optional<User> optionalUser = repository.findById(id);
        optionalUser.ifPresentOrElse(
                // If exists:
                user ->{
                    user.setFirstName(newUser.getFirstName());
                    user.setLastName(newUser.getLastName());
                    user.setUserName(newUser.getUserName());
                    user.setEmail(newUser.getEmail());
                    user.setPassword(newUser.getPassword());
                    repository.save(user);
                },
                // Else:
                () -> {
                    throw new IllegalArgumentException("There is no such user");
                }
        );
    }

    public void delete(String id){
        Optional<User> optionalUser = repository.findById(id);
        optionalUser.ifPresentOrElse(
                // If user exists
                repository::delete,
                // Else:
                () -> {
                    throw new IllegalArgumentException("There is no such user");
                }
        );
    }

    public List<User> getAll(){
        return repository.findAll();
    }

    public User getOne(String id){
        Optional<User> optionalUser = repository.findById(id);
        return optionalUser.orElseThrow(() -> new IllegalArgumentException("User couldn't found") );
    }
}

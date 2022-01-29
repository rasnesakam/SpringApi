package com.springApi.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/users")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAll(){
        return service.getAll();
    }

    @PostMapping
    public void add(@RequestBody User user){
        service.add(user);
    }

    @PutMapping(path = "{userId}")
    public void update(@PathVariable("userId") String userId, @RequestBody User user){
        service.update(userId,user);
    }

    @DeleteMapping(path = "{userId}")
    public void delete(@PathVariable("userId") String userId){
        service.delete(userId);
    }
}

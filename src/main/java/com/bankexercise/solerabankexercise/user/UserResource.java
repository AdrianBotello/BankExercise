package com.bankexercise.solerabankexercise.user;

import com.bankexercise.solerabankexercise.errorhandling.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
public class UserResource {

    private UserDaoService service;

    public UserResource(UserDaoService service) {
        this.service = service;
    }

    // GET /Users
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){

        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        User user =  service.findOne(id);
        if (user == null){
            throw new UserNotFoundException("id "+ id);
        }
        return user;
    }
    @GetMapping("/users/login/{email}/{password}")
    public boolean login(@PathVariable String email, @PathVariable String password){
        return service.login(email, password);
    }
    @GetMapping("/users/settings")
    public User settings(int id){
        return service.findOne(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        service.deleteById(id);
    }

    //POST /users
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser = service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();

    }

}

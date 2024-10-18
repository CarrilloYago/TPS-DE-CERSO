package com.yago_microservices.controller;

import com.yago_microservices.dto.ResponseDto;
import com.yago_microservices.entity.User;
import com.yago_microservices.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    UserService userService;
    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseDto> getUser(@PathVariable("id") Long userId){
        ResponseDto responseDto = userService.getUser(userId);
        return ResponseEntity.ok(responseDto);
    }
    @PostMapping
    public User save(@RequestBody User user){
       return userService.save(user);
    }
}

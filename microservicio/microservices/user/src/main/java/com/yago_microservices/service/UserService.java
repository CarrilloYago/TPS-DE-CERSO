package com.yago_microservices.service;

import com.yago_microservices.dto.ResponseDto;
import com.yago_microservices.dto.DepartmentDto;
import com.yago_microservices.dto.UserDto;
import com.yago_microservices.entity.User;
import com.yago_microservices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    APIClient apiClient;

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public ResponseDto getUser(Long userId) {
        ResponseDto responseDto = new ResponseDto();
        User user = userRepository.findById(userId).get();
        UserDto userDto = mapToUser(user);
        responseDto.setUser(userDto);

        DepartmentDto departmentDto = apiClient.getDepartmentById(user.getDepartmentId());
        responseDto.setDepartment(departmentDto);

        return responseDto;
    }

    private UserDto mapToUser(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}
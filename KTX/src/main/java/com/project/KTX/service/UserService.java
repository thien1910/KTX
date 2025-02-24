package com.project.KTX.service;

import com.project.KTX.dto.UserDto;
import com.project.KTX.dto.UserUpdateDto;
import com.project.KTX.entity.User;
import com.project.KTX.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser(UserDto userDto){
        User user = new User();

        if (userRepository.existsByuserName(userDto.getUserName()))
            throw new RuntimeException("User existed");

        user.setUserName(userDto.getUserName());
        user.setPassWord(userDto.getPassWord());
        user.setFullName(userDto.getFullName());
        user.setGender(userDto.getGender());
        user.setCccd(userDto.getCccd());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setStatus(userDto.getStatus());
        user.setCountry(userDto.getCountry());

        return userRepository.save(user);


    }

    public List<User> getUser() {
        return userRepository.findAll();
    }

    public User getUser (String userId ) {
        return userRepository.findById(userId).orElseThrow(()->
                new RuntimeException("User not found"));

    }
    public User updateUser(String userId, UserUpdateDto userDto) {
        User user = getUser(userId);

        user.setPassWord(userDto.getPassWord());
        user.setFullName(userDto.getFullName());
        user.setGender(userDto.getGender());
        user.setCccd(userDto.getCccd());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setStatus(userDto.getStatus());
        user.setCountry(userDto.getCountry());

        return userRepository.save(user);

    }

    public void deleteUser(String userId){
        userRepository.deleteById(userId);
    }
}

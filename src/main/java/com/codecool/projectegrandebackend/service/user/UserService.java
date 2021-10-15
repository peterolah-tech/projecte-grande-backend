package com.codecool.projectegrandebackend.service.user;

import com.codecool.projectegrandebackend.model.AppUser;
import com.codecool.projectegrandebackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public AppUser findUser(Long id){
        Optional<AppUser> user = userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }else{
            throw new IllegalStateException("Sorry user not found");
        }
    }

    public AppUser findByUserName(String username){
        Optional<AppUser> user = userRepository.findByUsername(username);
        if(user.isPresent()){
            return user.get();
        }else{
            throw new IllegalStateException("Sorry user not found");
        }
    }
}

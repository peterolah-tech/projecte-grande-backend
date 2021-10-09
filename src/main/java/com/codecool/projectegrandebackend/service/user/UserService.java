package com.codecool.projectegrandebackend.service.user;

import com.codecool.projectegrandebackend.model.User;
import com.codecool.projectegrandebackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findUser(Long id){
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }else{
            throw new IllegalStateException("Sorry no user");
        }
    }

}

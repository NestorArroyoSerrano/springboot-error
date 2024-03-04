package com.nestor.curso.springboot.error.springbooterror.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestor.curso.springboot.error.springbooterror.models.domain.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private List<User> users;

    @Override
    public List<User> findAll() {
       return users;
    }

    @Override
    public Optional<User> findById(Long id) {
       return users.stream().filter(u->u.getId().equals(id)).findFirst();
        
        /* 
        for(User u: users) {
            if (u.getId().equals(id)){
                user = u;
                break;
            }
            
        }
        /*
        if (user == null) {
            return Optional.empty();
        }
         */

       // return user;
    }

}

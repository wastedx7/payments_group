package com.paymentgroup.paymentgroup.services;

import java.util.Map;

import org.springframework.stereotype.Service;
import com.paymentgroup.paymentgroup.entity.users;
import com.paymentgroup.paymentgroup.reposiratory.usersrepo;
import 

@Service
public class usersservices {

    private final usersrepo userRepository;

    public usersservices(usersrepo userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<?> signup(@RequestBody Map<String, Long> request) {
        String email = (String) request.get("email");
        users user = userRepository.findByemail(email);
        if(user != null){
            return ResponseEntity.badRequest().body("User already exists");
        }

        String password = (String) entity.get("password");
        if (password != null){
            return ResponseEntity.badrequest().body("password not found");

        }


    }
}

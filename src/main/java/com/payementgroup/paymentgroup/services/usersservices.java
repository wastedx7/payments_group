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
            return ResponseEntity.badRequest().body("password not found");
            }
        hashedpassword = BCrypt.hashpw(password, BCrypt.gensalt());
        String name = (String) entity.get("name");
        if (name != null){
            return ResponseEntity.badRequest().body("name not found");
            }
        int phone_no = (int) entity.get("phone_no");
        
        users newuser = new users();
        newuser.setEmail(email);
        newuser.setPassword(hashedpassword);
        newuser.setName(name);
        newuser.setPhone(phone_no);
        userRepository.save(newuser);
        return ResponseEntity.ok("User registered successfully");
        

    }
}

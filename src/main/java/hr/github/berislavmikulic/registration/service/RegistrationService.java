package hr.github.berislavmikulic.registration.service;

import hr.github.berislavmikulic.registration.model.User;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public User register(User user){
//        TODO:
//        1. encrypt user password + salt
//        2. save user data with UserRepository
//        3. communicate with security and authentication service

        return user;
    }
}

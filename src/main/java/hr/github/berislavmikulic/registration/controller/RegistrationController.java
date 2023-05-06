package hr.github.berislavmikulic.registration.controller;

import hr.github.berislavmikulic.registration.model.User;
import hr.github.berislavmikulic.registration.service.RegistrationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class RegistrationController {

    private final RegistrationService registrationService;
    @Autowired
    public RegistrationController(RegistrationService registrationService){
        this.registrationService = registrationService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@Valid @RequestBody User user){

        User registeredUser = registrationService.register(user);
        return ResponseEntity.ok(registeredUser);
    }
}

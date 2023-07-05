package com.digitalvitae.streetdico.controllers;


import com.digitalvitae.streetdico.services.GoogleIdTokenVerifierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@RequestMapping("api/v1/users")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private GoogleIdTokenVerifierService googleIdTokenVerifierService;

    @PostMapping(path = "/user")
    public ResponseEntity<String> getUser(@RequestBody String token) {
        return ResponseEntity.ok(googleIdTokenVerifierService.verifyIdToken(token).toString());
    }
}

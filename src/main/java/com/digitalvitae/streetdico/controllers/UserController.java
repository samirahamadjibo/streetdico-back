package com.digitalvitae.streetdico.controllers;


import com.digitalvitae.streetdico.entities.User;
import com.digitalvitae.streetdico.entities.Word;
import com.digitalvitae.streetdico.services.GoogleIdTokenVerifierService;
import com.digitalvitae.streetdico.services.WordService;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

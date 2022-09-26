package com.digitalvitae.streetdico.controllers;


import com.digitalvitae.streetdico.entities.Word;
import com.digitalvitae.streetdico.services.GoogleIdTokenVerifierService;
import com.digitalvitae.streetdico.services.WordService;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.json.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;


@RestController
@Controller
@RequestMapping("api/v1/users")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private GoogleIdTokenVerifierService googleIdTokenVerifierService;

    @CrossOrigin()
    @PostMapping(path = "/user", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getUser(@RequestBody String token) throws GeneralSecurityException, IOException {
        return ResponseEntity.ok(googleIdTokenVerifierService.verifyIdToken(token));
    }
}

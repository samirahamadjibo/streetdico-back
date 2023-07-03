package com.digitalvitae.streetdico.controllers;


import com.digitalvitae.streetdico.entities.Word;
import com.digitalvitae.streetdico.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Controller
@RequestMapping("api/v1/words")
@CrossOrigin(origins = "*")
public class WordController {
    @Autowired
    WordService wordService;

    @GetMapping
    public ResponseEntity<List<Word>> getWords(){
        List<Word> words = new ArrayList<>();
        words.add(new Word(1L, "Meuf", "Femme"));
        words.add(new Word(1L, "Gechar", "Chargée"));
        words.add(new Word(1L, "Mec", "Homme"));

        return ResponseEntity.ok(words);
    }
    @DeleteMapping(path = "/word/{id}")
    public ResponseEntity<Long> deleteWord(@PathVariable("id") Long id){
        return ResponseEntity.ok(this.wordService.deleteWord(id));
    }
    @GetMapping(path = "/all")
    public ResponseEntity<List<Word>> getTrendingWords(){
        return ResponseEntity.ok(this.wordService.getAllWords());
    }
    @PostMapping(path = "/word", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Word> saveWord(@RequestBody Word word){
        return ResponseEntity.ok(this.wordService.saveWord(word));
    }
}

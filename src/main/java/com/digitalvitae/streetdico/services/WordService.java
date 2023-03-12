package com.digitalvitae.streetdico.services;

import com.digitalvitae.streetdico.mappers.WordMapper;
import com.digitalvitae.streetdico.entities.Word;
import com.digitalvitae.streetdico.repositories.WordRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@AllArgsConstructor
public class WordService {
    @Autowired
    WordRepository wordRepository;

    @Autowired
    WordMapper wordMapper;

    @PersistenceContext
    private EntityManager entityManager;


    public List<Word> getAllWords(){
        return this.wordRepository.findAll();
    }

    public Word saveWord(Word word) {
        this.wordRepository.save(word);
        return word;
    }

    public Long deleteWord(Long id) {
        this.wordRepository.deleteById(id);
        return id;
    }

    public List<Word> getTrendingWords() {
        return entityManager.createQuery("SELECT w FROM Word w ORDER BY w.id",
                Word.class).setMaxResults(3).getResultList();
    }
}

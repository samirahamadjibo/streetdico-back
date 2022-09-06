package com.digitalvitae.streetdico.repositories;

import com.digitalvitae.streetdico.entities.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> { }

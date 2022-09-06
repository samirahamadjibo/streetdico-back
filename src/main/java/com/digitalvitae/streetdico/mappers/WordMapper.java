package com.digitalvitae.streetdico.mappers;

import com.digitalvitae.streetdico.dtos.WordDto;
import com.digitalvitae.streetdico.entities.Word;
import org.springframework.stereotype.Service;

@Service
public class WordMapper {
    public Word toEntity(WordDto dto){
        return new Word().builder().id(dto.getId()).name(dto.getName()).definition(dto.getDefinition()).build();
    }

    public WordDto toDto(Word entity){
        return new WordDto().builder().id(entity.getId()).name(entity.getName()).definition(entity.getDefinition()).build();
    }
}

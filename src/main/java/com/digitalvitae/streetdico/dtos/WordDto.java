package com.digitalvitae.streetdico.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class WordDto {
    private Long id;
    private String name;
    private String definition;


}

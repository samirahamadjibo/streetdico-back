package com.digitalvitae.streetdico.entities;
import lombok.*;
import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "WORD", schema = "STRTDC")
public class Word {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "WORD_SEQ")
    @SequenceGenerator(name = "WORD_SEQ", sequenceName = "WORD_SEQ", schema = "STRTDC", allocationSize=1)
    Long id;

    @Column(name = "NAME")
    String name;

    @Column(name = "DEFINITION")
    String definition;
}

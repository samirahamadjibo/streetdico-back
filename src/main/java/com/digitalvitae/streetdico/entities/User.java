package com.digitalvitae.streetdico.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String email;
    private Boolean isEmailVerified;
    private String name;
    private String pictureUrl;
    private String locale;
    private String familyName;
    private String givenName;
    private String pseudo;

    @Override
    public String toString(){
        return "email: " + email + (isEmailVerified ? ",verified" : ",non verified") + " name: " + name + " pictureUrl: " + pictureUrl + " locale: " +locale + " familyName: " + familyName + " givenName: " + givenName;
    }
}

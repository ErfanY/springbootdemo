package com.eyousefi.springbootdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long userId;
   private String firstName;
   private String lastName;
   private String email;
   @JsonIgnore
   private String password;
   @JsonIgnore
   private String passwordSalt;
   private String avatar;
   private Long facebookId;
   private String facebookAccessToken;
   private String language;
   private String country;
   private Integer accountType;
   private Boolean confirmedEmail;
   private Boolean blocked;
   @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
   private LocalDateTime lastOnline;
   @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
   private LocalDateTime registered;
   @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
   private LocalDateTime updated;
   private String dateFormat;

   public Long getUserId() {
      return userId;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public String getEmail() {
      return email;
   }

   public String getPassword() {
      return password;
   }

   public String getPasswordSalt() {
      return passwordSalt;
   }

   public String getAvatar() {
      return avatar;
   }

   public Long getFacebookId() {
      return facebookId;
   }

   public String getFacebookAccessToken() {
      return facebookAccessToken;
   }

   public String getLanguage() {
      return language;
   }

   public String getCountry() {
      return country;
   }

   public Integer getAccountType() {
      return accountType;
   }

   public Boolean getConfirmedEmail() {
      return confirmedEmail;
   }

   public Boolean getBlocked() {
      return blocked;
   }

   public LocalDateTime getLastOnline() {
      return lastOnline;
   }

   public LocalDateTime getRegistered() {
      return registered;
   }

   public LocalDateTime getUpdated() {
      return updated;
   }

   public String getDateFormat() {
      return dateFormat;
   }
}

package krnlk.spring_playground.auth;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // 0L so spring boot knows to auto add id number without a need for it in the request body
    private Long id = 0L;
    private final String email;
    private final String login;
    private final String password;
    private final Date dateOfBirth;
}

package com.example.pollutionapi.model;

import com.mongodb.lang.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.math.BigInteger;

@Document("user")
@Data
public class User {
    @Id
    private BigInteger id;
    private String firstName;
    private String lastName;
    @Indexed(unique = true)
    private String email;
    private String password;
    private String phone;
    private String postcode;
    @Nullable
    private Collection<ApplicationUserRole> roles;

    public User(String firstName, String lastName, String email, String password, String phone, String postcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.postcode = postcode;
    }
}

package com.example.pollutionapi.service;



import com.example.pollutionapi.dao.UserRepository;
import com.example.pollutionapi.model.ApplicationUserRole;
import com.example.pollutionapi.model.User;
import java.util.Collection;
import java.util.HashSet;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
@RequiredArgsConstructor
public class UserService implements IUserService, UserDetailsService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found in the database!");
        } else {
            Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
            user.getRoles().forEach(role -> authorities.add(new SimpleGrantedAuthority(role.name())));
            return new org.springframework.security.core.userdetails.User(user.getEmail(),
                    user.getPassword(), authorities);
        }
    }

    @Override
    public void registerUser(User user) {
        Collection<ApplicationUserRole> userRoles = new HashSet<>();
        userRoles.add(ApplicationUserRole.USER);
        user.setRoles(userRoles);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }
}

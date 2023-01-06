package com.example.pollutionapi.model;

import java.util.HashSet;
import java.util.Set;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum ApplicationUserRole {

  USER("ROLE_USER"),
  ADMIN("ROLE_ADMIN");

  private final String role;

  ApplicationUserRole(String role) {
    this.role = role;
  }

  public Set<SimpleGrantedAuthority> getGrantedAuthority() {
    Set<SimpleGrantedAuthority> permissions = new HashSet<>();
    permissions.add(new SimpleGrantedAuthority(this.role));
    return permissions;
  }
}

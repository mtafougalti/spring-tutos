package com.mt.spring.authserver.repositories;

import com.mt.spring.authserver.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    public Optional<AppUser> findByUsername(String username);
}

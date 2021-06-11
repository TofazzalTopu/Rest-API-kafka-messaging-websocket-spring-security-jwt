package com.info.demo.repository;

import com.info.demo.model.Organization;
import com.info.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    List<User> findByOrganization(Organization organization);

    Optional<User> findByUsername(String username);
}

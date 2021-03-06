package com.stonksmmo.StonksMMOUserBackend.repository;

import com.stonksmmo.StonksMMOUserBackend.model.Role;
import com.stonksmmo.StonksMMOUserBackend.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(UserRole name);
}

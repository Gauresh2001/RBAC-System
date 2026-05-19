package com.rbac.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rbac.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByRoleName(String roleName);
}

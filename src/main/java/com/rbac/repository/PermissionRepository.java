package com.rbac.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rbac.entity.Permission;

import java.util.Optional;

public interface PermissionRepository extends JpaRepository<Permission, Long> {

    Optional<Permission> findByPermissionName(String permissionName);
}

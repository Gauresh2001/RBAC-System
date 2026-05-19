package com.rbac.service;
import com.rbac.dto.PermissionRequest;
import com.rbac.entity.Permission;
import com.rbac.repository.PermissionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService {

    private final PermissionRepository permissionRepository;

    public PermissionService(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    public Permission createPermission(PermissionRequest request) {
        Permission permission = new Permission();
        permission.setPermissionName(request.getPermissionName());
        return permissionRepository.save(permission);
    }

    public List<Permission> getAllPermissions() {
        return permissionRepository.findAll();
    }

    public void deletePermission(Long id) {
        permissionRepository.deleteById(id);
    }
}

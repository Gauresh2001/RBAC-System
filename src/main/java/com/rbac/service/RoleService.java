package com.rbac.service;
import com.rbac.dto.RoleRequest;
import com.rbac.entity.Permission;
import com.rbac.entity.Role;
import com.rbac.repository.PermissionRepository;
import com.rbac.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleService {

    private final RoleRepository roleRepository;
    private final PermissionRepository permissionRepository;

    public RoleService(RoleRepository roleRepository, PermissionRepository permissionRepository) {
        this.roleRepository = roleRepository;
        this.permissionRepository = permissionRepository;
    }

    public Role createRole(RoleRequest request) {

        Role role = new Role();
        role.setRoleName(request.getRoleName());

        Set<Permission> permissions = new HashSet<>();

        if (request.getPermissions() != null) {
            for (String permissionName : request.getPermissions()) {
                Permission permission = permissionRepository.findByPermissionName(permissionName)
                        .orElseThrow(() -> new RuntimeException("Permission not found: " + permissionName));
                permissions.add(permission);
            }
        }

        role.setPermissions(permissions);

        return roleRepository.save(role);
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}

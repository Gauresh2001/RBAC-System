package com.rbac.controller;
import com.rbac.dto.PermissionRequest;
import com.rbac.entity.Permission;
import com.rbac.service.PermissionService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permissions")
@CrossOrigin("*")
public class PermissionController {

    private final PermissionService permissionService;

    public PermissionController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @PostMapping
    public Permission createPermission(@Valid @RequestBody PermissionRequest request) {
        return permissionService.createPermission(request);
    }

    @GetMapping
    public List<Permission> getAllPermissions() {
        return permissionService.getAllPermissions();
    }

    @DeleteMapping("/{id}")
    public String deletePermission(@PathVariable Long id) {
        permissionService.deletePermission(id);
        return "Permission deleted successfully";
    }
}

package com.rbac.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Set;

@Data
public class RoleRequest {

    @NotBlank(message = "Role name is required")
    private String roleName;

    private Set<String> permissions;
}

package com.nss.usermanagement.role.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

@Data
@NoArgsConstructor
public class RolePermissionResponse {
    private Page<RolePermissionDTO> rolePermissionPage;
    private int currentPage;
    private long totalItems;
    private int totalPages;

    public RolePermissionResponse(Page<RolePermissionDTO> rolePermissionPage) {
        this.rolePermissionPage = rolePermissionPage;
        this.currentPage = rolePermissionPage.getNumber();
        this.totalItems = rolePermissionPage.getTotalElements();
        this.totalPages = rolePermissionPage.getTotalPages();
    }
}
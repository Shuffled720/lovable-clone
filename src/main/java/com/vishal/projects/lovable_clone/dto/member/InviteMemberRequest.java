package com.vishal.projects.lovable_clone.dto.member;

import com.vishal.projects.lovable_clone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}

package com.vishal.projects.lovable_clone.service;

import com.vishal.projects.lovable_clone.dto.auth.AuthResponse;
import com.vishal.projects.lovable_clone.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}

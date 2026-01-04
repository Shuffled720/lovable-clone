package com.vishal.projects.lovable_clone.service;

import com.vishal.projects.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.vishal.projects.lovable_clone.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}

package com.vishal.projects.lovable_clone.entity;


import com.vishal.projects.lovable_clone.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {
    Long id;

    User user;
    Plan plan;

    SubscriptionStatus status;

    String stripeCustomerId;
    String stripeSubscriptionId;

    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd = false;

    Instant createdAt;
    Instant updatedAt;
}

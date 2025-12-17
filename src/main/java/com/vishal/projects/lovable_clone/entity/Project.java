package com.vishal.projects.lovable_clone.entity;


import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {
    Long id;

    String name;

    User owner;

    Boolean isPublic;

    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt; //for soft delete
}

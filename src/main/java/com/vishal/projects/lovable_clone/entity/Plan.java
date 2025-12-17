package com.vishal.projects.lovable_clone.entity;


import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {
    Long id;

    String name;

    String stripePriceId;
    Integer maxProjects;
    Integer maxTokensPerDay;
    Integer maxPreviews;
    Boolean unlimited;

    Boolean active;

}

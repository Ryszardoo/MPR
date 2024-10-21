package com.example.volleyball.models;

import jakarta.persistence.Id;
import lombok.NonNull;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

public class PlayerRequest
{
//    @NonNull
//    @Id
//    @UuidGenerator
//    private UUID id;

    @NonNull
    private String name;
    @NonNull
    private String surname;

    private int age;
    private int height;
    private String role;
    private String gender;
}

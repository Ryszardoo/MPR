package com.example.volleyball.models;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class Player
{
    @NonNull
    private int id;
    @NonNull
    private String name;

    @NonNull
    private String surname;

    private int age;
    private int height;
    private String role;

}

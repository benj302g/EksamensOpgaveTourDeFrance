package com.example.eksamensopgavetourdefrance.model;

import com.example.eksamensopgavetourdefrance.enums.Shirt;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Lombok autogenerere setters, getter og constructors
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Cyclist {
    // Hver cyclist har et autogenerated id, en age, en samlet tid, bjergpoint, og spurtpoint. De har også et team, dvs many cyclists to one team.

    @Id
    // laver automatisk et nyt id hver gang vi laver en cyclist
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private int age;
    private String name;
    private double samletTid;
    private int bjergpoint;
    private int spurtpoint;


    @ManyToOne
    private Team team;

    // @JoinColumn(name = "teamId", referencedColumnName = "id")
    // Kun brug join column hvis du vil ændre navnet på din foreign key kolonne.
    // Her siger vi at vi gerne vil have en foreign key til teamet i form af en kolonne der hedder "teamid" (name = "teamId"),
    // hvis værdi skal være den samme som "id" i team klassen (referencedColumnName = "id").



}

package com.fastcampus.batchcampus;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.StringReader;

@Data
@Entity
@NoArgsConstructor
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private String age;

    private String region;

    private String telephone;
}

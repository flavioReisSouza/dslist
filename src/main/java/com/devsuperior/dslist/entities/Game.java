package com.devsuperior.dslist.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Entity // ORM mapeamento do objeto relacional (banco de dados)
@Table(name = "tb_game") // ORM
public class Game {

    @Id // ORM
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ORM
    private Long id;

    private String title;

    @Column(name = "game_year") // ORM
    private Integer year;

    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;
}

package com.devsuperior.DSList.entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Objects;

//Seed -> povoar o banco
//ORM (Object-Relational Mapping) é uma técnica que permite mapear
//objetos de um sistema orientado a objetos a estruturas de dados de um banco de dados relacional.
@Entity  //esta configurando essa classe para que seja equivalente a uma tabela de um banco relacional
@Table(name="tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String title;

    //estou constumizando essa coluna no BD, senãoo nome seria year e é um nome reservado no banco
    @Column(name="game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    //vai gerar uma coluna como tipo 'texto' e não varchar que aceita so 255 caracteres
    @Column(columnDefinition = "TEXT")
    private String longDescription;



    public Game(){

    }

    public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl, String shortDescription, String longDescription) {
        Id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;

    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }



    //metodos usados para comparar 2 objetos (dois Game's)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(Id, game.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }
}

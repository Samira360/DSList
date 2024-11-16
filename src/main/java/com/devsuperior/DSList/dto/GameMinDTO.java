package com.devsuperior.DSList.dto;


/*

 DTO (Data Tranfer Object) basecamente serve para pegar um objeto com os campos especificos
 sem precisar pegar todos os campos, posso criar um DTO onde ele tem apenas o ID e o Titulo e atc
 Os controller recebem dos serviços objetos DTO e não o objeto em si,
 "Objetos customizados só com as informações que eu preciso"

    Informações sobre o DTO:
     - DTO não esta mapeado com o banco, é uma classe idependente, então não colocamos as annotations de BD
     - No DTO só precisamos de GETTERS
     - No DTO o construtor recebe uma entity
 */

import com.devsuperior.DSList.entities.Game;
import jakarta.persistence.Column;

public class GameMinDTO {

    private Long Id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){

    }

    //estou criando essa DTO com base da Entity
    public GameMinDTO(Game entity) {
        this.Id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }


    public Long getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}

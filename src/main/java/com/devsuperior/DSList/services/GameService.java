package com.devsuperior.DSList.services;


/*

 Os Services são responsaveis por implementar logica de negocio
 Orquestra tudo que for necessarios para realizar uma operação de negocio

 Informações sobre os Services:
     - Preciso registrar ele como se fosse um componente no sistema usando a annotation @Component ou coloca @Service
     (Os componentes precisam ser registrados, pois o framework que vai gerenciar esses componentes, ele que sabe instanciar os componentes, reaproveitar)
     - Injeto o Repository usando a annotation @Autowired (O Spring vai resolver a dependencia)
     - Os Serivces sempre vão retornar um DTO
*/

import com.devsuperior.DSList.dto.GameMinDTO;
import com.devsuperior.DSList.entities.Game;
import com.devsuperior.DSList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    //Injetando o GameRepository no componente atual

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {

        List<Game> result = gameRepository.findAll();
        // para cada objeto Game da list Result eu passo ele como parametro para o construtor do GameMinDTO (QUE ESTA COM PARAMETROS REDUZIDOS)
        List<GameMinDTO> dto = result.stream().map(GameMinDTO::new).toList();
        return dto;
    }

}

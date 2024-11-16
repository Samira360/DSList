package com.devsuperior.DSList.controllers;

import com.devsuperior.DSList.dto.GameMinDTO;
import com.devsuperior.DSList.entities.Game;
import com.devsuperior.DSList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/*
    Os Controllers são a porta de entrada ao BackEnd,
    toda requisição vai passar por aqui e daqui vai conversar com o BackEnd

    Informações sobre os Controllers:
        - Configurar a classe como um controlador que vai receber e enviar requisições json coloque a annotation @RestController
        - Para mapear o recurso use a annotation @RequestMapping
        - Preciso injetar o Service aqui usando a annotation @Autowired
        - Cada metodo é mapeado com o verbo da requisição, seja GET, POST, DELETE e etc


 */
@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }

}

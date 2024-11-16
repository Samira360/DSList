package com.devsuperior.DSList.repositories;


/*

  Os Repositories são interfaces responsaveis por fazer consulta ao banco de dados

  Informações sobre os Repositories:
     - Sempre extendo o JpaRepository passando o tipo da Entity e o tipo do Id
      (Só com isso ele ja vai poder criar, deletar, consultar e alterar no nosso banco de dados)

*/

import com.devsuperior.DSList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
}

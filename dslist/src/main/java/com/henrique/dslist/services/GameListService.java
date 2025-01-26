package com.henrique.dslist.services;

import com.henrique.dslist.dto.GameDTO;
import com.henrique.dslist.dto.GameListDTO;
import com.henrique.dslist.dto.GameMinDTO;
import com.henrique.dslist.entities.Game;
import com.henrique.dslist.entities.GameList;
import com.henrique.dslist.repositories.GameListRepository;
import com.henrique.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}

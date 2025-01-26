package com.henrique.dslist.dto;

import com.henrique.dslist.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

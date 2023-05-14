package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor

public class GameListDTO {

    private Long id;

    private String name;

    public GameListDTO(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }
}

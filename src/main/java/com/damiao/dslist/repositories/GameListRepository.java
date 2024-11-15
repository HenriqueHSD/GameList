package com.damiao.dslist.repositories;

import com.damiao.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository <GameList, Long> {
}

package com.hmgomes.dslist.repository;

import com.hmgomes.dslist.entities.Game;
import com.hmgomes.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList,Long> {
}

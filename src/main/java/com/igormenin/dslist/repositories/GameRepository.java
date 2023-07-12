package com.igormenin.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.igormenin.dslist.entities.Game;
import com.igormenin.dslist.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	@Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.title, tb_game.game_year as `year`, 
					tb_game.img_url as imgUrl, tb_game.short_description as shortDescription, 
					tb_belonging.position
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
			where tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
			""")
	List<GameMinProjection> searchByList(Long listId);
	
	
}

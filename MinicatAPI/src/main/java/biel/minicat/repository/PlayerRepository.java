package biel.minicat.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import biel.minicat.model.Player;

public interface PlayerRepository extends CrudRepository<Player, Long> {
	List<Player> getTop10ByRank();
}

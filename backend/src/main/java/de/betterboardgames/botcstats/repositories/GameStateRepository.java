package de.betterboardgames.botcstats.repositories;

import de.betterboardgames.botcstats.models.GameState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameStateRepository extends JpaRepository<GameState, Long> {

}

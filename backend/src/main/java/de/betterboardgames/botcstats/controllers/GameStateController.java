package de.betterboardgames.botcstats.controllers;

import de.betterboardgames.botcstats.dtos.GameStateDTO;
import de.betterboardgames.botcstats.services.GameStateService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameStateController {

  @Autowired
  GameStateService gameStateService;

  @PostMapping("/gamestate")
  public void allStates(@RequestBody GameStateDTO gameState) {
    gameStateService.addGameState(gameState);
  }


  @GetMapping("/gamestates")
  public List<GameStateDTO> allStates() {
    return gameStateService.list();
  }

}

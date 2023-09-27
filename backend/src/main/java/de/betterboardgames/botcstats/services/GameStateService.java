package de.betterboardgames.botcstats.services;

import de.betterboardgames.botcstats.dtos.GameStateDTO;
import de.betterboardgames.botcstats.models.GameState;
import de.betterboardgames.botcstats.models.User;
import de.betterboardgames.botcstats.repositories.GameStateRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameStateService {

  @Autowired
  private GameStateRepository gameStateRepository;

  @Autowired
  private UserService userService;

  public void addGameState(GameStateDTO gameState) {
    gameStateRepository.save(mapToDomain(gameState));
  }

  public List<GameStateDTO> list() {
    return gameStateRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
  }

  private GameStateDTO mapToDTO(GameState gameState) {
    GameStateDTO gameStateDTO = new GameStateDTO();
    BeanUtils.copyProperties(gameState, gameStateDTO, "storyTeller", "players");
    gameStateDTO.setStoryTeller(gameState.getStoryTeller().getUsername());
    gameStateDTO.setPlayers(gameState.getPlayers().stream().map(User::getUsername).collect(
        Collectors.toList()));
    return gameStateDTO;
  }

  private GameState mapToDomain(GameStateDTO gameStateDTO) {
    GameState gameState = new GameState();
    BeanUtils.copyProperties(gameStateDTO, gameState, "storyTeller", "players");
    User storyteller = userService.findUserForIdOrCreate(gameStateDTO.getStoryTeller());
    gameState.setStoryTeller(storyteller);
    gameState.setPlayers(
        gameStateDTO.getPlayers().stream().map(u -> userService.findUserForIdOrCreate(u)).collect(
            Collectors.toList()));
    return gameState;
  }


}

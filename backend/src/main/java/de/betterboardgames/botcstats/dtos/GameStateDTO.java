package de.betterboardgames.botcstats.dtos;

import de.betterboardgames.botcstats.models.Alignment;
import de.betterboardgames.botcstats.models.Character;
import java.util.List;

public class GameStateDTO {


  private String storyTeller;
  private List<String> players;

  private List<Character> handedOutCharacters;

  private List<Character> bluffs;

  private double duration;

  private Alignment winningTeam;

  private String script;


  public String getStoryTeller() {
    return storyTeller;
  }

  public void setStoryTeller(String storyTeller) {
    this.storyTeller = storyTeller;
  }

  public List<String> getPlayers() {
    return players;
  }

  public void setPlayers(List<String> players) {
    this.players = players;
  }

  public List<Character> getHandedOutCharacters() {
    return handedOutCharacters;
  }

  public void setHandedOutCharacters(List<Character> handedOutCharacters) {
    this.handedOutCharacters = handedOutCharacters;
  }

  public List<Character> getBluffs() {
    return bluffs;
  }

  public void setBluffs(List<Character> bluffs) {
    this.bluffs = bluffs;
  }

  public double getDuration() {
    return duration;
  }

  public void setDuration(double duration) {
    this.duration = duration;
  }

  public Alignment getWinningTeam() {
    return winningTeam;
  }

  public void setWinningTeam(Alignment winningTeam) {
    this.winningTeam = winningTeam;
  }

  public String getScript() {
    return script;
  }

  public void setScript(String script) {
    this.script = script;
  }


}

package de.betterboardgames.botcstats.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class GameState {

  @Id
  @UuidGenerator
  private String id;

  @ManyToOne
  private User storyTeller;
  @ManyToMany
  private List<User> players;
  @Enumerated(EnumType.STRING)
  private List<Character> handedOutCharacters;

  @Enumerated(EnumType.STRING)
  private List<Character> bluffs;

  private double duration;

  @Enumerated(EnumType.STRING)
  private Alignment winningTeam;

  private String script;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public User getStoryTeller() {
    return storyTeller;
  }

  public void setStoryTeller(User storyTeller) {
    this.storyTeller = storyTeller;
  }

  public List<User> getPlayers() {
    return players;
  }

  public void setPlayers(List<User> players) {
    this.players = players;
  }

  public List<Character> getHandedOutCharacters() {
    return handedOutCharacters;
  }

  public void setHandedOutCharacters(
      List<Character> handedOutCharacters) {
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

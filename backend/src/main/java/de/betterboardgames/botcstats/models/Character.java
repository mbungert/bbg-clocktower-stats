package de.betterboardgames.botcstats.models;

import static de.betterboardgames.botcstats.models.CharacterClass.*;
import static de.betterboardgames.botcstats.models.Alignment.*;

public enum Character {

  POISONER(EVIL, MINION), NO_DASHI(EVIL, DEMON);

  Character(Alignment alignment, CharacterClass characterClass) {
    this.alignment = alignment;
    this.characterClass = characterClass;
  }

  private Alignment alignment;
  private CharacterClass characterClass;
}

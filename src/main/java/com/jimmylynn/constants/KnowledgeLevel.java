package com.jimmylynn.constants;

import java.util.Arrays;
import java.util.Optional;

public enum KnowledgeLevel {
  BEGINNER("beginner"),
  INTERMEDIATE("intermediate"),
  PRO("pro");

  private String knowledgeLevel;

  KnowledgeLevel(String knowledgeLevel) {
    this.knowledgeLevel = knowledgeLevel;
  }

  public String getKnowledgeLevel() {
    return knowledgeLevel;
  }

  public static Optional<KnowledgeLevel> get(String knowledgeLevel) {
    return Arrays.stream(KnowledgeLevel.values())
        .filter(env -> env.knowledgeLevel.equals(knowledgeLevel))
        .findFirst();
  }
}

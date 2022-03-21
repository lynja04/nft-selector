package com.jimmylynn.constants;

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
}

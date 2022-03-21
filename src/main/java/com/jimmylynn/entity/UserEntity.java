package com.jimmylynn.entity;

import com.jimmylynn.constants.KnowledgeLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  String username;
  String password;

  @Enumerated(EnumType.STRING)
  KnowledgeLevel knowledgeLevel;

  public UserEntity(String username, String password, KnowledgeLevel level) {
    this.username = username;
    this.password = password;
    this.knowledgeLevel = level;
  }
}

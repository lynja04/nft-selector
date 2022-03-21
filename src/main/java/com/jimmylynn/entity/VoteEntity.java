package com.jimmylynn.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "votes")
@Data
public class VoteEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  Integer userId;
  String category;
}

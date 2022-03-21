package com.jimmylynn.dto;

import com.jimmylynn.constants.KnowledgeLevel;
import lombok.Data;

@Data
public class LoginDTO {
  String username;
  String password;
  KnowledgeLevel knowledgeLevel;
}

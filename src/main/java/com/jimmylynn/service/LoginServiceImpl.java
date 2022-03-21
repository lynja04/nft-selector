package com.jimmylynn.service;

import com.jimmylynn.UserRepository;
import com.jimmylynn.constants.KnowledgeLevel;
import com.jimmylynn.dto.LoginDTO;
import com.jimmylynn.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

  private final UserRepository userRepository;

  @Override
  public void login(LoginDTO loginDTO) {
    userRepository.save(new UserEntity(loginDTO.getUsername(), loginDTO.getPassword(),
        KnowledgeLevel.get(loginDTO.getKnowledgeLevel()).orElse(null)));
  }
}

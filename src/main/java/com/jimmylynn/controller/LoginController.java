package com.jimmylynn.controller;

import com.jimmylynn.dto.LoginDTO;
import com.jimmylynn.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

  private final LoginService loginService;

  @PostMapping("/")
  public Integer login(@RequestBody LoginDTO loginDTO) {
    return loginService.login(loginDTO);
  }
}

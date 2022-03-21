package com.jimmylynn.controller;

import com.jimmylynn.dto.LoginDTO;
import com.jimmylynn.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
@CrossOrigin
public class LoginController {

  private final LoginService loginService;

  @PostMapping("/")
  public void login(@RequestBody LoginDTO loginDTO) {
    loginService.login(loginDTO);
  }
}

package com.jimmylynn.controller;

import com.jimmylynn.dto.VoteDTO;
import com.jimmylynn.dto.VotingResultsDTO;
import com.jimmylynn.service.VotingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/voting")
@RequiredArgsConstructor
public class VotingController {

  private final VotingService votingService;

  @PostMapping("/")
  public void castVote(@RequestBody VoteDTO voteDTO) {
    votingService.castVote(voteDTO);
  }

  @GetMapping("/results/{userId}")
  public VotingResultsDTO getVotingResults(@PathVariable("userId") Integer userId) {
    return votingService.getVotingResults(userId);
  }
}

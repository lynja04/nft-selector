package com.jimmylynn.service;

import com.jimmylynn.dto.VoteDTO;
import com.jimmylynn.dto.VotingResultsDTO;

public interface VotingService {
  public void castVote(VoteDTO voteDTO);
  public VotingResultsDTO getVotingResults(Integer userId);
}

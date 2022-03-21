package com.jimmylynn.service;

import com.jimmylynn.dto.VoteDTO;
import com.jimmylynn.dto.VotingResultsDTO;
import com.jimmylynn.entity.VoteEntity;
import com.jimmylynn.entity.projections.VotingResults;
import com.jimmylynn.repository.VoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VotingServiceImpl implements VotingService{

  private final VoteRepository voteRepository;
  private final List<String> categories;

  @Override
  public void castVote(VoteDTO voteDTO) {
    VoteEntity voteEntity = new VoteEntity();
    voteEntity.setUserId(voteDTO.getUserId());
    voteEntity.setCategory(voteDTO.getCategory());
    voteRepository.save(voteEntity);
  }

  @Override
  public VotingResultsDTO getVotingResults(Integer userId) {
    VotingResultsDTO votingResultsDTO = new VotingResultsDTO();
    votingResultsDTO.setUserId(userId);
    votingResultsDTO.setWinningCategory(getTopCategory(userId));
    return votingResultsDTO;
  }

  private String getTopCategory(Integer userId) {
    List<VotingResults> amounts = new ArrayList<>();
    categories.forEach(category -> amounts.add(voteRepository.getCountByUserIdAndCategory(userId, category)));
    VotingResults votingResults = amounts.stream().max(Comparator.comparingInt(VotingResults::getCategoryAmount))
        .orElse(null);
    return votingResults != null ? votingResults.getCategory() : null;
  }
}

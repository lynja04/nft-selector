package com.jimmylynn.repository;

import com.jimmylynn.entity.VoteEntity;
import com.jimmylynn.entity.projections.VotingResults;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoteRepository extends JpaRepository<VoteEntity, Integer> {
  List<VoteEntity> findAllByUserId(Integer userId);

  @Query(nativeQuery = true, value = "SELECT userId as userId, category as category, count(*) as categoryAmount FROM votes WHERE category = ?2 GROUP BY ?1")
  VotingResults getCountByUserIdAndCategory(Integer userId, String category);
}

package com.dhl.highscore.repositories;

import java.util.List;

import com.dhl.highscore.entities.HighScore;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "highScores", path = "highScores")
public interface HighScoreRepository extends PagingAndSortingRepository<HighScore, Long>, CrudRepository<HighScore,Long> {

    @Query(value = "SELECT s from HighScore s where s.score = (select max(s2.score) from HighScore s2)")
    List<HighScore> getMaxScore();

}

package com.dhl.highscore.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class HighScore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private LocalDateTime highScoreTimestamp = LocalDateTime.now();

    private Integer score;

    public long getId() {
        return id;
    }

    public void setId(long _id) {
        id = _id;
    }

    public LocalDateTime getHighScoreTimestamp() {
        return highScoreTimestamp;
    }

    public void setHighScoreTimestamp(LocalDateTime _highScoreTimestamp) {
        highScoreTimestamp = _highScoreTimestamp;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer _score) {
        score = _score;
    }

}

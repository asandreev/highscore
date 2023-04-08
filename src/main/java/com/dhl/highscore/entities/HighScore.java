package com.dhl.highscore.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HIGH_SCORES")
public class HighScore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "HIGH_SCORE_TIMESTAMP")
    private LocalDateTime highScoreTimestamp = LocalDateTime.now();

    @Column(name = "NAME")
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

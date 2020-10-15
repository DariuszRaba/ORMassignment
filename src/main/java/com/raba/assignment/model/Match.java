package com.raba.assignment.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "match_id")
    private long matchId;

    private Date date;

    @Column(name = "home_team_id")
    private long homeTeamId;

    @Column(name = "away_team_id")
    private long awayTeamId;

    @Column(name = "goals_home")
    private int goalsHome;

    @Column(name = "goals_away")
    private int goalsAway;

    public Match() {
    }

    public long getMatchId() {
        return matchId;
    }

    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(long homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public long getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(long awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public int getGoalsHome() {
        return goalsHome;
    }

    public void setGoalsHome(int goalsHome) {
        this.goalsHome = goalsHome;
    }

    public int getGoalsAway() {
        return goalsAway;
    }

    public void setGoalsAway(int goalsAway) {
        this.goalsAway = goalsAway;
    }
}

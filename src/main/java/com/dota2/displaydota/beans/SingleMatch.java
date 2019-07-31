package com.dota2.displaydota.beans;

import java.util.Date;

public class SingleMatch {
   
    int matchId;
    Date duration;
    Date startTime;
    int radiantTeamId;
    String radiantName;
    int direTeamId;
    String direName;
    int leagueId;
    String leagueName;
    int seriesId;
    //maybe change this type?
    int seriesType;
    int radiantScore;
    int direScore;
    boolean radiantWin;
    //Whether the team/player/hero was on Radiant
    boolean radiant;

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public int getRadiantTeamId() {
        return radiantTeamId;
    }

    public void setRadiantTeamId(int radiantTeamId) {
        this.radiantTeamId = radiantTeamId;
    }

    public String getRadiantName() {
        return radiantName;
    }

    public void setRadiantName(String radiantName) {
        this.radiantName = radiantName;
    }

    public int getDireTeamId() {
        return direTeamId;
    }

    public void setDireTeamId(int direTeamId) {
        this.direTeamId = direTeamId;
    }

    public String getDireName() {
        return direName;
    }

    public void setDireName(String direName) {
        this.direName = direName;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public int getSeriesType() {
        return seriesType;
    }

    public void setSeriesType(int seriesType) {
        this.seriesType = seriesType;
    }

    public int getRadiantScore() {
        return radiantScore;
    }

    public void setRadiantScore(int radiantScore) {
        this.radiantScore = radiantScore;
    }

    public int getDireScore() {
        return direScore;
    }

    public void setDireScore(int direScore) {
        this.direScore = direScore;
    }

    public boolean isRadiantWin() {
        return radiantWin;
    }

    public void setRadiantWin(boolean radiantWin) {
        this.radiantWin = radiantWin;
    }

    public boolean isRadiant() {
        return radiant;
    }

    public void setRadiant(boolean radiant) {
        this.radiant = radiant;
    }
    


}
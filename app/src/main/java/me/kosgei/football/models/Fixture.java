package me.kosgei.football.models;

import org.parceler.Parcel;

@Parcel
public class Fixture {
    private int fixtureId;
    private int leagueId;
    private String eventDate;
    private long eventTimestamp;
    private long firstHalfStart;
    private long secondHalfStart;
    private String round;
    private String status;
    private String venue;
    private String referee;

    private String homeTeamId;
    private String homeTeamName;
    private String homeTeamLogo;

    private String awayTeamId;
    private String awayTeamName;
    private String awayTeamLogo;

    private int goalsHomeTeam;
    private int goalsAwayTeam;

    private String halfTime;
    private String fullTime;
    private String extraTime;
    private String penalty;

    public Fixture() {
    }

    public Fixture(int fixtureId, int leagueId, String event_date, long eventTimestamp, long firstHalfStart, long secondHalfStart, String round, String status, String venue, String referee, String homeTeamId, String homeTeamName, String homeTeamLogo, String awayTeamId, String awayTeamName, String awayTeamLogo, int goalsHomeTeam, int goalsAwayTeam, String halfTime, String fullTime, String extraTime, String penalty) {
        this.fixtureId = fixtureId;
        this.leagueId = leagueId;
        this.eventDate = event_date;
        this.eventTimestamp = eventTimestamp;
        this.firstHalfStart = firstHalfStart;
        this.secondHalfStart = secondHalfStart;
        this.round = round;
        this.status = status;
        this.venue = venue;
        this.referee = referee;
        this.homeTeamId = homeTeamId;
        this.homeTeamName = homeTeamName;
        this.homeTeamLogo = homeTeamLogo;
        this.awayTeamId = awayTeamId;
        this.awayTeamName = awayTeamName;
        this.awayTeamLogo = awayTeamLogo;
        this.goalsHomeTeam = goalsHomeTeam;
        this.goalsAwayTeam = goalsAwayTeam;
        this.halfTime = halfTime;
        this.fullTime = fullTime;
        this.extraTime = extraTime;
        this.penalty = penalty;
    }

    public int getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(int fixtureId) {
        this.fixtureId = fixtureId;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String event_date) {
        this.eventDate = event_date;
    }

    public long getEventTimestamp() {
        return eventTimestamp;
    }

    public void setEventTimestamp(long eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    public long getFirstHalfStart() {
        return firstHalfStart;
    }

    public void setFirstHalfStart(long firstHalfStart) {
        this.firstHalfStart = firstHalfStart;
    }

    public long getSecondHalfStart() {
        return secondHalfStart;
    }

    public void setSecondHalfStart(long secondHalfStart) {
        this.secondHalfStart = secondHalfStart;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public String getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(String homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getHomeTeamLogo() {
        return homeTeamLogo;
    }

    public void setHomeTeamLogo(String homeTeamLogo) {
        this.homeTeamLogo = homeTeamLogo;
    }

    public String getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(String awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public String getAwayTeamLogo() {
        return awayTeamLogo;
    }

    public void setAwayTeamLogo(String awayTeamLogo) {
        this.awayTeamLogo = awayTeamLogo;
    }

    public int getGoalsHomeTeam() {
        return goalsHomeTeam;
    }

    public void setGoalsHomeTeam(int goalsHomeTeam) {
        this.goalsHomeTeam = goalsHomeTeam;
    }

    public int getGoalsAwayTeam() {
        return goalsAwayTeam;
    }

    public void setGoalsAwayTeam(int goalsAwayTeam) {
        this.goalsAwayTeam = goalsAwayTeam;
    }

    public String getHalfTime() {
        return halfTime;
    }

    public void setHalfTime(String halfTime) {
        this.halfTime = halfTime;
    }

    public String getFullTime() {
        return fullTime;
    }

    public void setFullTime(String fullTime) {
        this.fullTime = fullTime;
    }

    public String getExtraTime() {
        return extraTime;
    }

    public void setExtraTime(String extraTime) {
        this.extraTime = extraTime;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }
}

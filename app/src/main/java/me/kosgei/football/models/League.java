package me.kosgei.football.models;

import java.util.Date;

public class League {
    private int leagueId;
    private String name;
    private String country;
    private String countryCode;
    private int season;
    private String seasonStart;
    private String seasonEnd;
    private String logo;
    private String flag;
    private int standings;
    private int isCurrent;

    public League(int leagueId, String name, String country, String countryCode, int season, String seasonStart, String seasonEnd, String logo, String flag, int standings, int isCurrent) {
        this.leagueId = leagueId;
        this.name = name;
        this.country = country;
        this.countryCode = countryCode;
        this.season = season;
        this.seasonStart = seasonStart;
        this.seasonEnd = seasonEnd;
        this.logo = logo;
        this.flag = flag;
        this.standings = standings;
        this.isCurrent = isCurrent;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getSeasonStart() {
        return seasonStart;
    }

    public void setSeasonStart(String seasonStart) {
        this.seasonStart = seasonStart;
    }

    public String getSeasonEnd() {
        return seasonEnd;
    }

    public void setSeasonEnd(String seasonEnd) {
        this.seasonEnd = seasonEnd;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getStandings() {
        return standings;
    }

    public void setStandings(int standings) {
        this.standings = standings;
    }

    public int getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(int isCurrent) {
        this.isCurrent = isCurrent;
    }
}

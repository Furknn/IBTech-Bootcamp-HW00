package com.bootcamphw.hw03;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private long teamId;
    private String teamName;
    private List<Player> players;
    private League league;

    public Team(long teamId, String teamName) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.players=new ArrayList<Player>();
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        players.add(player);
        player.setTeam(this);
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
}

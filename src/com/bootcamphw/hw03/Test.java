package com.bootcamphw.hw03;

public class Test {
    public static void main(String[] args) {
        League league = new League(1, "Süperlig");
        Team team1 = new Team(1, "Godoro Spor");
        league.addTeam(team1);
        team1.setLeague(league);

        // create 11 Players
        var player1 = new Player(401, "Teoman Alpay", 4.67);
        var player2 = new Player(402, "Yusuf Nalkesen", 7.89);
        var player3 = new Player(403, "Avni Anıl", 6.61);

        team1.addPlayer(player1);
        player1.setTeam(team1);
        team1.addPlayer(player2);
        player2.setTeam(team1);
        team1.addPlayer(player3);
        player3.setTeam(team1);

        var team2= new Team(2, "Fibiler Spor");
        league.addTeam(team2);
        team2.setLeague(league);

        var player4 = new Player(404, "Yıldırım Gürses", 2.93);
        var player5 = new Player(405, "Erdoğan Berker", 8.11);

        team2.addPlayer(player4);
        player4.setTeam(team2);
        team2.addPlayer(player5);
        player5.setTeam(team2);

    }

}

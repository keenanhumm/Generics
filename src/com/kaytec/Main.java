package com.kaytec;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> crows = new Team<>("The Crows");
        crows.addPlayer(joe);
//        crows.addPlayer(pat);
//        crows.addPlayer(beckham);

        Team<BaseballPlayer> baseballTeam = new Team<>("The Chicago Cubs");
        baseballTeam.addPlayer(pat);
    }
}

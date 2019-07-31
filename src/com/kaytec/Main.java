package com.kaytec;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static void printRankings(List<Team> teams) {
        System.out.println("Rankings");
        teams.forEach(Team::printRanking);
    }

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

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(crows, 3, 8);

        crows.matchResult(fremantle, 2,1);
//        crows.matchResult(baseballTeam, 1,1);

        ArrayList<Team> teams = new ArrayList<>();
        teams.add(hawthorn);
        teams.add(baseballTeam);
        teams.add(brokenTeam);
        teams.add(melbourne);
        teams.add(fremantle);
        teams.add(crows);

        printRankings(teams);


    }
}

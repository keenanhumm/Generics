package com.kaytec;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " was picked for " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
}

    public void matchResult(Team<T> opponent, int ourScore, int opponentScore) {
        String message;

        if (ourScore > opponentScore) {
            message = " beat ";
            won++;
        } else if (opponentScore > ourScore) {
            message = " lost to ";
            lost++;
        } else {
            message = " tied with ";
            tied++;
        }
        played++;

        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, opponentScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    public void printRanking() {
        System.out.println(this.getName() + ": " + this.ranking());
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        } else if(this.ranking() < team.ranking()) {
            return 1;
        }
        return 0;
    }
}

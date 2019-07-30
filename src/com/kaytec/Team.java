package com.kaytec;

import java.util.ArrayList;

public class Team<T extends Player> {
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
            System.out.println(((Player)player).getName() + " is already on the team");
            return false;
        } else {
            members.add(player);
            System.out.println(((Player)player).getName() + " was picked for " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int opponentScore) {
        if (ourScore > opponentScore) {
            won++;
        } else if (opponentScore > ourScore) {
            lost++;
        } else {
            tied++;
        }
        played++;

        if (opponent != null) {
            opponent.matchResult(null, opponentScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}

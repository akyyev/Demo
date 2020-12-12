package com.demo.Interview_Questions.Json_to_java_obj;

import java.util.List;

public class Players {
    List<Player> players;

    public Players(List<Player> players) {
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Players{" +
                "players=" + players +
                "}";
    }
}


package com.minebone.thetowers.api.events;

import org.bukkit.entity.Player;

import java.util.List;

public class ArenaEndEvent extends TheTowersEvent {

    private final List<Player> winners;
    private final List<Player> losers;
    private final boolean force;

    public ArenaEndEvent(List<Player> winners, List<Player> losers, boolean force) {
        this.winners = winners;
        this.losers = losers;
        this.force = force;
    }

    public List<Player> getWinners() {
        return winners;
    }

    public List<Player> getLosers() {
        return losers;
    }

    public boolean isForce() {
        return force;
    }
}

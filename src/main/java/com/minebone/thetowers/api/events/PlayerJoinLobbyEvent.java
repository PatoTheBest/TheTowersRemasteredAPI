package com.minebone.thetowers.api.events;

import com.minebone.thetowers.api.IArena;
import org.bukkit.entity.Player;

public class PlayerJoinLobbyEvent extends TheTowersEvent {

    private final Player player;
    private final IArena arena;

    public PlayerJoinLobbyEvent(Player player, IArena arena) {
        this.player = player;
        this.arena = arena;
    }

    public Player getPlayer() {
        return player;
    }

    public IArena getArena() {
        return arena;
    }
}
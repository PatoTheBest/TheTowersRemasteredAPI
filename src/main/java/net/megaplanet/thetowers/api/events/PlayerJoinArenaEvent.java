package net.megaplanet.thetowers.api.events;

import net.megaplanet.thetowers.api.IArena;
import org.bukkit.entity.Player;

public class PlayerJoinArenaEvent extends TheTowersEvent {

    private final Player player;
    private final IArena arena;

    public PlayerJoinArenaEvent(Player player, IArena arena) {
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
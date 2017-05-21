package net.megaplanet.thetowers.api.events;

import net.megaplanet.thetowers.api.IArena;
import net.megaplanet.thetowers.api.IGameTeam;
import org.bukkit.entity.Player;

public class PlayerLeaveArenaEvent extends TheTowersEvent {

    private final Player player;
    private final IArena arena;
    private final IGameTeam gameTeam;

    public PlayerLeaveArenaEvent(Player player, IArena arena, IGameTeam gameTeam) {
        this.player = player;
        this.arena = arena;
        this.gameTeam = gameTeam;
    }

    public Player getPlayer() {
        return player;
    }

    public IArena getArena() {
        return arena;
    }

    public IGameTeam getGameTeam() {
        return gameTeam;
    }
}
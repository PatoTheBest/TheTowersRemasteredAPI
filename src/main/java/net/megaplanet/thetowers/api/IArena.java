package net.megaplanet.thetowers.api;

import org.bukkit.DyeColor;
import org.bukkit.World;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.entity.Player;

import java.util.List;

public interface IArena extends ConfigurationSerializable {

    void addPlayer(Player player);

    void removePlayer(Player player);

    void startGame();

    void endArena();

    void enableArena();

    void disableArena();

    IGameTeam getGameTeamPreference(Player player);

    IGameTeam getGameTeam(Player player);

    IGameTeam getGameTeam(DyeColor color);

    void removeGameTeam(String name);

    boolean isFull();

    String getName();

    void save();

    boolean isEnabled();

    World getWorld();

    boolean containsTeam(String name);

    IGameTeam getGameTeam(String name);

    List<Player> getArenaPlayers();

    int getMinPlayers();

    int getMaxPlayers();

    void setMinPlayers(int minPlayers);

    void setMaxPlayers(int maxPlayers);
}

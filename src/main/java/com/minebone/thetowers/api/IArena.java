package com.minebone.thetowers.api;

import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.entity.Player;

import java.util.List;

public interface IArena extends ConfigurationSerializable {

    void addLobbyPlayer(Player player);

    void addGamePlayer(Player player);

    void removePlayer(Player player);

    void startGame();

    void endArena();

    void enableArena();

    void disableArena();

    IGameTeam getTeamPreference(Player player);

    IGameTeam getTeam(Player player);

    IGameTeam getTeam(DyeColor color);

    void removeGameTeam(String name);

    void sendMessageToArena(String message);

    boolean isFull();

    String getName();

    void save();

    boolean isEnabled();

    World getWorld();

    boolean containsTeam(String name);

    IGameTeam getTeam(String name);

    List<Player> getPlayers();

    int getMinPlayers();

    int getMaxPlayers();

    ArenaState getArenaState();

    void setMinPlayers(int minPlayers);

    void setMaxPlayers(int maxPlayers);

    List<Location> getPlacedChests();
}

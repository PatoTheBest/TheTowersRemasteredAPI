package net.megaplanet.thetowers.api;

import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.entity.Player;

import java.util.List;

public interface IGameTeam extends ConfigurationSerializable {

    DyeColor getColor();

    String getName();

    Location getSpawn();

    List<Player> getPlayers();

    int getPoints();

    void setPoints(int points);
}

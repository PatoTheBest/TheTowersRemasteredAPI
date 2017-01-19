package com.minebone.thetowers.api;

import org.bukkit.ChatColor;

public enum ArenaState {

    WAITING(4, ChatColor.YELLOW),
    IN_GAME(5, ChatColor.GREEN),
    RESTARTING(14, ChatColor.RED),
    OTHER(15, ChatColor.RED),
    ERROR(15, ChatColor.RED);

    private final short data;
    private final ChatColor chatColor;
    private String status;

    ArenaState(int data, ChatColor chatColor) {
        this.data = (short) data;
        this.chatColor = chatColor;
        this.status = chatColor + name().substring(0, 1) + name().toLowerCase().substring(1, name().length()).replace("_", " ");
    }

    public ChatColor getChatColor() {
        return chatColor;
    }

    public short getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

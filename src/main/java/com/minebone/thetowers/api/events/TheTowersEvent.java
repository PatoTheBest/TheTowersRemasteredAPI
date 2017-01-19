package com.minebone.thetowers.api.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

class TheTowersEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
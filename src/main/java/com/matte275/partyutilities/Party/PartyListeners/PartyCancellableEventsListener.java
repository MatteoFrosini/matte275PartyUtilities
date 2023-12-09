package com.matte275.partyutilities.Party.PartyListeners;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PartyCancellableEventsListener implements Listener{
    @EventHandler
    public void onInteract(InventoryClickEvent e){
        if (e.getView().title().toString().contains("Party")){
            e.setCancelled(true);
        }
    }
}

package com.matte275.partyutilities.Party.PartyListeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PartyMenuListener implements Listener{
    @EventHandler
    public void onInteract(InventoryClickEvent e){
        if (e.getView().title().toString().contains("Party Invite")){

        }
    }
}

package com.matte275.partyutilities;

import com.matte275.partyutilities.Party.PartyCommands.PartyInvite;
import com.matte275.partyutilities.Party.PartyCommands.PartyMenu;
import com.matte275.partyutilities.Libraries.ChatColors;
import com.matte275.partyutilities.Libraries.Panels;
import com.matte275.partyutilities.Party.PartyListeners.PartyCancellableEventsListener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class PartyUtilities extends JavaPlugin {
    public static Plugin plugin;
    public static Panels panels = new Panels();
    public static Plugin getPlugin() {
        return plugin;
    }
    @Override
    public void onEnable() {
        plugin = this;
        this.getCommand("party").setExecutor(new PartyMenu());
        this.getCommand("partyinvite").setExecutor(new PartyInvite());
        this.getServer().getPluginManager().registerEvents(new PartyCancellableEventsListener(), this);
        getLogger().info(ChatColors.stringColor(ChatColors.GREEN,"<-- 275's Party Utilities: successfully started -->"));
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

package com.matte275.partyutilities;

import com.matte275.partyutilities.Commands.Party.PartyInvite;
import com.matte275.partyutilities.Libraries.ChatColors;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class PartyUtilities extends JavaPlugin {
    public static Plugin plugin;
    public static Plugin getPlugin() {
        return plugin;
    }
    @Override
    public void onEnable() {
        plugin = this;
        this.getCommand("partyinvite").setExecutor(new PartyInvite());
        getLogger().info(ChatColors.stringColor(ChatColors.GREEN,"<-- 275's Party Utilities: successfully started -->"));
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

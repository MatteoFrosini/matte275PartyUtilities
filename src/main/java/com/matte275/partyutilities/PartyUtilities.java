package com.matte275.partyutilities;

import org.bukkit.plugin.java.JavaPlugin;

public final class PartyUtilities extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info(ChatColors.stringColor(ChatColors.GREEN,"<-- 275's Party Utilities: successfully started -->"));
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

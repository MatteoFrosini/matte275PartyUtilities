package com.matte275.partyutilities.Party.PartyCommands;

import com.matte275.partyutilities.Libraries.Panels;
import com.matte275.partyutilities.Party.PartyListeners.PartyInviteListener;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

import static com.matte275.partyutilities.PartyUtilities.getPlugin;

public class PartyInvite implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player p){
            Inventory menu = Bukkit.createInventory(p,54, Component.text().append(Component.text("Party Menu")).build());
            for (int i = 0; i < 9; i++) {
                menu.setItem(i, Panels.nullPanel);
            }
            menu.setItem(9, Panels.nullPanel);
            menu.setItem(17, Panels.nullPanel);

            menu.setItem(18, Panels.nullPanel);
            menu.setItem(26, Panels.nullPanel);

            menu.setItem(27, Panels.nullPanel);
            menu.setItem(35, Panels.nullPanel);

            menu.setItem(36, Panels.nullPanel);
            menu.setItem(44, Panels.nullPanel);

            menu.setItem(45, Panels.nullPanel);
            menu.setItem(46, Panels.nullPanel);
            menu.setItem(47, Panels.nullPanel);

            menu.setItem(51, Panels.nullPanel);
            menu.setItem(52, Panels.nullPanel);
            menu.setItem(53, Panels.nullPanel);
            PartyInviteListener.updatePage();
            p.openInventory(menu);
        } else {
            getPlugin().getLogger().warning("You can't use this command in the server console");
        }
        return true;
    }
}

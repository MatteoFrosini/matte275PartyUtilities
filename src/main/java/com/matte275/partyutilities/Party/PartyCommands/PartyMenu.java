package com.matte275.partyutilities.Party.PartyCommands;

import com.matte275.partyutilities.Libraries.Panels;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

import static com.matte275.partyutilities.PartyUtilities.getPlugin;

public class PartyMenu implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player p){
            Inventory menu = Bukkit.createInventory(p,27, Component.text().append(Component.text("Party Menu")).build());
            for (int i = 0; i < 9; i++) {
                menu.setItem(i, Panels.nullPanel);
            }
            menu.setItem(9, Panels.nullPanel);
            menu.setItem(10, Panels.partyInvite);
            menu.setItem(11, Panels.nullPanel);
            menu.setItem(12, Panels.nullPanel);
            menu.setItem(13, Panels.partyList);
            menu.setItem(14, Panels.nullPanel);
            menu.setItem(15, Panels.nullPanel);
            menu.setItem(16, Panels.partyRemove);
            menu.setItem(17, Panels.nullPanel);
            for (int i = 18; i <= 26; i++) {
                menu.setItem(i, Panels.nullPanel);
            }
            p.openInventory(menu);
        } else {
            getPlugin().getLogger().warning("You can't use this command in the server console");
        }
        return true;
    }
}
/*Player target = Bukkit.getPlayerExact(strings[0]);
            if (target == null){
                p.sendMessage("This player doesn't exist");
                return true;
            }

ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD);
            SkullMeta headMeta = (SkullMeta) playerHead.getItemMeta();
            headMeta.setOwningPlayer(p);
            playerHead.setItemMeta(headMeta);
            menu.setItem(9, playerHead);
* */
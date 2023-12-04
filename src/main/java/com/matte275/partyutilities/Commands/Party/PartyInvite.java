package com.matte275.partyutilities.Commands.Party;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static com.matte275.partyutilities.PartyUtilities.getPlugin;

public class PartyInvite implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player p){
            Player target = Bukkit.getPlayerExact(strings[0]);
            if (target == null){
                p.sendMessage("This player doesn't exist");
                return true;
            }
            getPlugin().getLogger().info("GG");
            target.sendMessage("bone fra");
        } else {
            getPlugin().getLogger().warning("No GG");
        }
        return true;
    }
}
package com.matte275.partyutilities.Libraries;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Panels {
    public static ItemStack nullPanel = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
    public static ItemStack confirmMenuTrue = new ItemStack(Material.LIME_CONCRETE);
    public static ItemStack confirmMenuFalse = new ItemStack(Material.RED_CONCRETE);
    public static ItemStack confirmMenuWaiver = new ItemStack(Material.PAPER);
    public static ItemStack partyInvite = new ItemStack(Material.GREEN_CONCRETE_POWDER);
    public static ItemStack partyList = new ItemStack(Material.YELLOW_CONCRETE_POWDER);
    public static ItemStack partyRemove = new ItemStack(Material.RED_CONCRETE_POWDER);
    public Panels() {
        setNullPanelMeta(nullPanel);
        setConfirmMenuTrue(confirmMenuTrue);
        setConfirmMenuFalse(confirmMenuFalse);
        setConfirmMenuWaiver(confirmMenuWaiver);
        setPartyInvite(partyInvite);
        setPartyList(partyList);
        setPartyRemove(partyRemove);
    }
    public void setNullPanelMeta(ItemStack panel){
        ItemMeta panelItemMeta = panel.getItemMeta();
        final TextComponent title = Component.text().append(Component.text("")).build();
        panelItemMeta.displayName(title);
        panel.setItemMeta(panelItemMeta);
    }
    public static void setConfirmMenuWaiver(ItemStack panel){
        ItemMeta panelItemMeta = panel.getItemMeta();
        final TextComponent title = Component.text().decoration(TextDecoration.ITALIC,false)
                .color(TextColor.color(255, 170, 0))
                .append(Component.text("You sure?"))
                .build();
        panelItemMeta.displayName(title);
        List<Component> lore = new ArrayList<>();
        lore.add(Component.text().decoration(TextDecoration.ITALIC,false)
                .color(TextColor.color(85,85,85))
                .append(Component.text("Are you sure that")).build());
        lore.add(Component.text().decoration(TextDecoration.ITALIC,false)
                .color(TextColor.color(85,85,85))
                .append(Component.text("you want to do this?")).build());
        panelItemMeta.addEnchant(Enchantment.ARROW_INFINITE,1,true);
        panelItemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        panelItemMeta.lore(lore);
        panel.setItemMeta(panelItemMeta);
    }
    public static void setConfirmMenuTrue(ItemStack panel){
        ItemMeta panelItemMeta = panel.getItemMeta();
        final TextComponent title = Component.text().decoration(TextDecoration.ITALIC,false)
                .color(TextColor.color(85,255,85))
                .append(Component.text("Yes, i'm sure"))
                .build();
        panelItemMeta.displayName(title);
        panel.setItemMeta(panelItemMeta);
    }
    public static void setConfirmMenuFalse(ItemStack panel){
        ItemMeta panelItemMeta = panel.getItemMeta();
        final TextComponent title = Component.text().decoration(TextDecoration.ITALIC,false)
                .color(TextColor.color(255,85,85))
                .append(Component.text("No, take me back"))
                .build();
        panelItemMeta.displayName(title);
        panel.setItemMeta(panelItemMeta);
    }
    public static void setPartyInvite(ItemStack panel){
        ItemMeta panelItemMeta = panel.getItemMeta();
        final TextComponent title = Component.text().decoration(TextDecoration.ITALIC,false)
                .color(TextColor.color(85,255,85))
                .append(Component.text("Invite someone!"))
                .build();
        panelItemMeta.displayName(title);
        List<Component> lore = new ArrayList<>();
        lore.add(Component.text().decoration(TextDecoration.ITALIC,false)
                .color(TextColor.color(85,85,85))
                .append(Component.text("Press this button")).build());
        lore.add(Component.text().decoration(TextDecoration.ITALIC,false)
                .color(TextColor.color(85,85,85))
                .append(Component.text("to invite new players")).build());
        lore.add(Component.text().decoration(TextDecoration.ITALIC,false)
                .color(TextColor.color(85,85,85))
                .append(Component.text("to the party!")).build());
        panelItemMeta.lore(lore);
        panel.setItemMeta(panelItemMeta);
    }
    public static void setPartyList(ItemStack panel){
        ItemMeta panelItemMeta = panel.getItemMeta();
        final TextComponent title = Component.text().decoration(TextDecoration.ITALIC,false)
                .color(TextColor.color(255,255,85))
                .append(Component.text("Party List!"))
                .build();
        panelItemMeta.displayName(title);
        List<Component> lore = new ArrayList<>();
        lore.add(Component.text().decoration(TextDecoration.ITALIC,false)
                .color(TextColor.color(85,85,85))
                .append(Component.text("Show all the people")).build());
        lore.add(Component.text().decoration(TextDecoration.ITALIC,false)
                .color(TextColor.color(85,85,85))
                .append(Component.text("in your party")).build());
        panelItemMeta.lore(lore);
        panel.setItemMeta(panelItemMeta);
    }
    public static void setPartyRemove(ItemStack panel){
        ItemMeta panelItemMeta = panel.getItemMeta();
        final TextComponent title = Component.text().decoration(TextDecoration.ITALIC,false)
                .color(TextColor.color(255,85,85))
                .append(Component.text("Remove someone"))
                .build();
        panelItemMeta.displayName(title);
        List<Component> lore = new ArrayList<>();
        lore.add(Component.text().decoration(TextDecoration.ITALIC,false)
                .color(TextColor.color(85,85,85))
                .append(Component.text("Press this button")).build());
        lore.add(Component.text().decoration(TextDecoration.ITALIC,false)
                .color(TextColor.color(85,85,85))
                .append(Component.text("to remove someone")).build());
        lore.add(Component.text().decoration(TextDecoration.ITALIC,false)
                .color(TextColor.color(85,85,85))
                .append(Component.text("from the party")).build());
        panelItemMeta.lore(lore);
        panel.setItemMeta(panelItemMeta);
    }
}
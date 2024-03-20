package kbtdx.man10tradeshop;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.*;

public class Utils {

    public static ItemStack createItemStack(Material mate, int amount, String name){
        ItemStack item = new ItemStack(mate,amount);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(name));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack createItemStack(Material mate, int amount){return new ItemStack(mate, amount);}

    public static ItemStack createItemStack(Material mate, int amount, List<String> lore,String name){
        ItemStack item = new ItemStack(mate,amount);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(name));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }
}

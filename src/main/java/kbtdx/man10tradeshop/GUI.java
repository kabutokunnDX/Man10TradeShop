package kbtdx.man10tradeshop;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import static kbtdx.man10tradeshop.Man10TradeShop.prefix;

public class GUI {

    public static void openMenuGUI(Player p){

    }

    public static void createShopGUI(Player p){
        Inventory i = Bukkit.createInventory(null,54, Component.text(prefix + " ショップを作成しますか？"));
        for (int j=0;j<9;j++){i.setItem(j,Utils.createItemStack(Material.WHITE_STAINED_GLASS_PANE,1,""));}
        i.setItem(10,Utils.createItemStack(Material.LIME_STAINED_GLASS_PANE,1,"§aはい"));
        i.setItem(11,Utils.createItemStack(Material.LIME_STAINED_GLASS_PANE,1,"§aはい"));
        i.setItem(12,Utils.createItemStack(Material.LIME_STAINED_GLASS_PANE,1,"§aはい"));
        i.setItem(13,Utils.createItemStack(Material.WHITE_STAINED_GLASS_PANE,1,""));
        i.setItem(14,Utils.createItemStack(Material.RED_STAINED_GLASS_PANE,1,"§aいいえ"));
        i.setItem(15,Utils.createItemStack(Material.RED_STAINED_GLASS_PANE,1,"§aいいえ"));
        i.setItem(16,Utils.createItemStack(Material.RED_STAINED_GLASS_PANE,1,"§aいいえ"));
        i.setItem(17,Utils.createItemStack(Material.WHITE_STAINED_GLASS_PANE,1,""));
    }


    public static void selectShopGUI(Player p){}
}

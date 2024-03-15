package kbtdx.man10tradeshop;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Man10TradeShop extends JavaPlugin {

    public static JavaPlugin plugin;
    public static FileConfiguration config;
    public static Boolean isSetup;
    public static String prefix;


    @Override
    public void onEnable() {
        plugin = this;
        plugin.saveDefaultConfig();
        plugin.getServer().getPluginManager().registerEvents(new ShopListeners(),this);
        config = plugin.getConfig();
        isSetup = config.getBoolean("isSetup");
        prefix = "§7[§f§eMan10TradeShop§f§7]";
        if (!isSetup){
            Bukkit.getLogger().warning("セットアップがされていません。/mts setupより、セットアップを完了させてください。");
        }
        plugin.getCommand("mts").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {}
}

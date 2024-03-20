package kbtdx.man10tradeshop;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Man10TradeShop extends JavaPlugin {

    public static JavaPlugin plugin;
    public static FileConfiguration config;
    public static String prefix;
    public static VaultManager vault;
    public static MySQLManager mysql;


    @Override
    public void onEnable() {
        plugin = this;
        plugin.saveDefaultConfig();
        plugin.getServer().getPluginManager().registerEvents(new ShopListeners(),this);
        config = plugin.getConfig();
        prefix = "§7[§f§eMan10TradeShop§f§7]";
        plugin.getCommand("mts").setExecutor(new Commands());
        vault = new VaultManager(this);
        mysql = new MySQLManager(this,"mtradeshop");
        mysql.execute("create table if not exists mts_data(id int auto_increment,owner_uuid varchar(36),permission text,insert_item longtext,prize_item longtext, amount int,max_trade int,primary key(id))");

    }

    @Override
    public void onDisable() {}
}

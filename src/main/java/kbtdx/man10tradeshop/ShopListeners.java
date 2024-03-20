package kbtdx.man10tradeshop;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

import java.util.Objects;

public class ShopListeners implements Listener {

    @EventHandler
    public void onSingUpdate(SignChangeEvent e){
        if (e.getLine(0) == null)return;
        if (Objects.requireNonNull(e.getLine(0)).equalsIgnoreCase("mtradeshop") || Objects.requireNonNull(e.getLine(0)).equalsIgnoreCase("adtradeshop"))return;
        if (!e.getPlayer().hasPermission("mts.user")){return;}

    }
}

package kbtdx.man10tradeshop;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static kbtdx.man10tradeshop.Man10TradeShop.prefix;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!sender.hasPermission("mts.user")){sender.sendMessage(prefix + "§4権限がありません。");return true;}
        if (!command.getName().equalsIgnoreCase("mts")){
            return true;
        }else {
            if (args.length == 0){
                GUI.openMenuGUI((Player) sender);
            } else if (args.length == 1) {
                if (args[0].equalsIgnoreCase("help")){
                    sendHelp(sender);
                    return true;
                }

            }
        }

        return true;
    }



    public void sendHelp(CommandSender sender){
        sender.sendMessage(prefix);
        sender.sendMessage("/mts shops Man10TradeShopのGUIを開きます。");
        sender.sendMessage("/mts help ヘルプを表示します。");
        sender.sendMessage("/mts create ショップを作成します。1000円かかります。");
        sender.sendMessage("/mts delete");
        if (sender.hasPermission("mts.op")){
            sender.sendMessage("/mts on システムをオンにします。");
            sender.sendMessage("/mts off システムをオフにします。");
            sender.sendMessage("/mts adcreate アドミンショップを作ります。(non)");
        }
    }
}

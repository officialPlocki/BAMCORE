package de.buildandmine.core.commands.admin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.buildandmine.core.utils.Language;

public class day
        implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
        Player p = (Player) sender;
        if (p.hasPermission("core.day")) {
            p.sendMessage(Language.prefix+"Die Zeit wurde auf Tag gestellt!");
            p.getWorld().setTime(2000L);
            return false;
        }
        p.sendMessage(Language.noperm);
        return false;
    }
}
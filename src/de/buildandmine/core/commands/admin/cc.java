package de.buildandmine.core.commands.admin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.buildandmine.core.utils.Language;

public class cc implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		Player p = (Player)arg0;
		if(p.hasPermission("core.cc")) {
			p.sendMessage(Language.prefix+"Du hast den Chat geleert!");
			for(Player all : Bukkit.getOnlinePlayers()) {
				if(!all.hasPermission("core.cc.bypass")) {
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage("§7");
					all.sendMessage(Language.prefix+"Der Chat wurde geleert.");
					return true;
				}
			}
		} else {
			p.sendMessage(Language.noperm);
		}
		return false;
	}

}

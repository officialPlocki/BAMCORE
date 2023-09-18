package de.buildandmine.core.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.buildandmine.core.utils.Language;

public class fly implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		Player p = (Player)arg0;
		if(p.hasPermission("core.fly")) {
			if(p.getAllowFlight()==true) {
				p.setAllowFlight(false);
				p.sendMessage(Language.prefix+"Fly wurde deaktiviert!");
				return true;
			} else {
				p.setAllowFlight(true);
				p.sendMessage(Language.prefix+"Fly wurde aktiviert!");
				return true;
			}
		} else {
			p.sendMessage(Language.noperm);
		}
		return false;
	}

}

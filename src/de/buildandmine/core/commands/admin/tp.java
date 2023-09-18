package de.buildandmine.core.commands.admin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.buildandmine.core.main.Main;
import de.buildandmine.core.utils.Language;

public class tp implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		Player p = (Player)sender;
		
		if(p.hasPermission("core.tp")) {
			if(args.length==0) {
				p.sendMessage(Language.prefix+"Bitte gebe einen Spieler an!");
			} else if(args.length==1) {
				p.teleport(Bukkit.getPlayer(args[0]));
				p.sendMessage(Language.prefix+"Du wurdest teleportiert.");
			}
		} else {
			sender.sendMessage(Language.noperm);
		}
		return false;
	}

}

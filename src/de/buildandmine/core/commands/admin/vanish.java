package de.buildandmine.core.commands.admin;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.buildandmine.core.utils.Language;

public class vanish implements CommandExecutor{

	public static ArrayList<Player> vanished = new ArrayList<>();
	public static ArrayList<Player> chat = new ArrayList<>();

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			
			if(p.hasPermission("core.vanish")) {
				if(args.length == 0) {
					if(!vanished.contains(p)) {
						vanished.add(p);
						chat.add(p);
						p.sendMessage(Language.prefix + "Du bist nun im Vanish.");
						for(Player all : Bukkit.getOnlinePlayers()) {
							if(!all.hasPermission("core.vanish.bypass")) {
								all.hidePlayer(p);
							}
						}
					} else {
						vanished.remove(p);
						chat.remove(p);
						p.sendMessage(Language.prefix + "Du bist nun nicht mehr im Vanish.");
						for(Player all : Bukkit.getOnlinePlayers()) {
							all.showPlayer(p);
						}
					} 
				} else {
					p.sendMessage(Language.prefix + "§cBenutze: /vanish");
				}
			} else {
				p.sendMessage(Language.noperm);
			}
		}
		return true;
	}

}

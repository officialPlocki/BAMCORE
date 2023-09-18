package de.buildandmine.core.commands.admin;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.buildandmine.core.utils.Language;

public class gm implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player)sender;
		
		if(p.hasPermission("core.gamemode")) {
			if(args.length==0) {
				p.sendMessage(Language.prefix+"Bitte verwende §e/gm <0, 1, 3> (Spieler)");
			} else if(args.length==1){
				if(args[0].equalsIgnoreCase("0")) {
					if(p.hasPermission("core.gamemode.survival")) {
						p.setGameMode(GameMode.SURVIVAL);
						p.sendMessage(Language.prefix+"Dein Spielmodus wurde geändert.");
					} else {
						p.sendMessage(Language.noperm);
					}
				} else if(args[0].equalsIgnoreCase("1")) {
					if(p.hasPermission("core.gamemode.creative")) {
						p.setGameMode(GameMode.CREATIVE);
						p.sendMessage(Language.prefix+"Dein Spielmodus wurde geändert.");
					} else {
						p.sendMessage(Language.noperm);
					}
				} else if(args[0].equalsIgnoreCase("3")) {
					if(p.hasPermission("core.gamemode.spectator")) {
						p.setGameMode(GameMode.SPECTATOR);
						p.sendMessage(Language.prefix+"Dein Spielmodus wurde geändert.");
					} else {
						p.sendMessage(Language.noperm);
					}
				} else {
					p.sendMessage(Language.prefix+"Bitte verwende §e/gm <0, 1, 3> (Spieler)");
				}
			} else if(args.length==2) {
				if(Bukkit.getPlayer(args[1]).isOnline()) {
					if(p.hasPermission("core.gamemode.other")) {
						Player t = Bukkit.getPlayer(args[1]);
						if(args[0].equalsIgnoreCase("0")) {
							if(p.hasPermission("core.gamemode.survival")) {
								t.setGameMode(GameMode.SURVIVAL);
								p.sendMessage(Language.prefix+"Der Spielmodus wurde geändert.");
							} else {
								p.sendMessage(Language.noperm);
							}
						} else if(args[0].equalsIgnoreCase("1")) {
							if(p.hasPermission("core.gamemode.creative")) {
								t.setGameMode(GameMode.CREATIVE);
								p.sendMessage(Language.prefix+"Der Spielmodus wurde geändert.");
							} else {
								p.sendMessage(Language.noperm);
							}
						} else if(args[0].equalsIgnoreCase("3")) {
							if(p.hasPermission("core.gamemode.spectator")) {
								t.setGameMode(GameMode.SPECTATOR);
								p.sendMessage(Language.prefix+"Der Spielmodus wurde geändert.");
							} else {
								p.sendMessage(Language.noperm);
							}
						} else {
							p.sendMessage(Language.prefix+"Bitte verwende §e/gm <0, 1, 3> (Spieler)");
						}
					} else {
						p.sendMessage(Language.noperm);
					}
				} else {
					p.sendMessage(Language.prefix+"Der Spieler ist nicht online.");
				}
			} else {
				p.sendMessage(Language.prefix+"Bitte verwende §e/gm <0, 1, 3> (Spieler)");
			}
		} else {
			p.sendMessage(Language.noperm);
		}
		
		return false;
	}

}

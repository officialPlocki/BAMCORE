package de.buildandmine.core.utils.chat;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.buildandmine.core.commands.admin.vanish;
import de.buildandmine.core.utils.Language;

public class ChatHandler implements Listener{
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		e.setCancelled(true);
		Player p = e.getPlayer();
		String rang = "";
		
		//vanish handler

	    if(vanish.chat.contains(p)) {
			if(e.getMessage().equalsIgnoreCase("accept")) {
				vanish.chat.remove(p);
				p.sendMessage(Language.prefix + "§aDu hast den Chat freigeschaltet.");
				return;
			}
			p.sendMessage(Language.prefix + "§7Schreibe §6'accept' §7in den Chat, um diesen benutzen zu können.");
			return;
		}
		
		//ränge
		
		if(p.hasPermission("group.owner")) {
			rang = "§4Owner §8│  §7"+p.getName().toString()+" §8» §7";
		} else if(p.hasPermission("group.leitung")) {
			rang = "§4Leitung §8│  §7"+p.getName().toString()+" §8» §7";
		} else if(p.hasPermission("group.admin")) {
			rang = "§4Admin §8│  §7"+p.getName().toString()+" §8» §7";
		} else if(p.hasPermission("group.dev")) {
			rang = "§bDev §8│  §7"+p.getName().toString()+" §8» §7";
		} else if(p.hasPermission("group.mod+")) {
			rang = "§cMod+ §8│  §7"+p.getName().toString()+" §8» §7";
		} else if(p.hasPermission("group.mod")) {
			rang = "§cMod §8│  §7"+p.getName().toString()+" §8» §7";
		} else if(p.hasPermission("group.builder")) {
			rang = "§aBuilder §8│  §7"+p.getName().toString()+" §8» §7";
		} else if(p.hasPermission("group.sup+")) {
			rang = "§eSup+ §8│  §7"+p.getName().toString()+" §8» §7";
		} else if(p.hasPermission("group.sup")) {
			rang = "§eSup §8│  §7"+p.getName().toString()+" §8» §7";
		} else if(p.hasPermission("group.tsup")) {
			rang = "§9T-Sup §8│  §7"+p.getName().toString()+" §8» §7";
		} else if(p.hasPermission("group.miner")) {
			rang = "§6Miner §8│  §7"+p.getName().toString()+" §8» §7";
		} else if(p.hasPermission("group.obsidian")) {
			rang = "§5Obsidian §8│  §7"+p.getName().toString()+" §8» §7";
		} else if(p.hasPermission("group.emerald")) {
			rang = "§aEmerald §8│  §7"+p.getName().toString()+" §8» §7";
		} else if(p.hasPermission("group.diamond")) {
			rang = "§bDiamond §8│  §7"+p.getName().toString()+" §8» §7";
		} else if(p.hasPermission("group.gold")) {
			rang = "§6Gold §8│  §7"+p.getName().toString()+" §8» §7";
		} else if(p.hasPermission("group.iron")) {
			rang = "§7Iron §8│  §7"+p.getName().toString()+" §8» §7";
		} else if(p.hasPermission("group.default")) {
			rang = "§7Spieler §8│  §7"+p.getName().toString()+" §8» §7";
		}
		
		//chat sender
		
		
		if(p.hasPermission("core.chat.colored")) {
			Bukkit.getServer().broadcastMessage(rang+e.getMessage().replaceAll("&", "§"));
			return;
		}
		Bukkit.getServer().broadcastMessage(rang+e.getMessage());
	}

}

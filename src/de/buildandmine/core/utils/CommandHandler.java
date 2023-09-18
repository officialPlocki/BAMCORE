package de.buildandmine.core.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerCommandSendEvent;
import org.bukkit.event.server.TabCompleteEvent;
import org.bukkit.help.HelpTopic;

public class CommandHandler implements Listener{
	
	@EventHandler
	public void onTab(TabCompleteEvent e) {
		if(!e.getSender().hasPermission("core.tab.bypass")) {
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void blockedCommands(PlayerCommandPreprocessEvent e) {
		Player p = e.getPlayer();
		String msg = e.getMessage().split(" ")[0];
		if(msg.equalsIgnoreCase("op")) {
			e.setCancelled(true);
			p.sendMessage(Language.noperm);
		}
		if(e.getPlayer().hasPermission("core.command.bypass")) {
			return;
		} else {
			if(msg.equalsIgnoreCase("pl")||msg.equalsIgnoreCase("plugins")||msg.equalsIgnoreCase("plugin")||msg.equalsIgnoreCase("?")||msg.equalsIgnoreCase("help")||msg.equalsIgnoreCase("bukkit:pl")||msg.equalsIgnoreCase("bukkit:plugins")||msg.equalsIgnoreCase("bukkit:plugin")||msg.equalsIgnoreCase("bukkit:?")||msg.equalsIgnoreCase("bukkit:help")||msg.equalsIgnoreCase("me")||msg.equalsIgnoreCase("minecraft:me")||msg.equalsIgnoreCase("tell")||msg.equalsIgnoreCase("minecraft:tell")) {
					p.sendMessage(Language.noperm);
					e.setCancelled(true);
			}
			if(msg.equalsIgnoreCase("rl")||msg.equalsIgnoreCase("reload")||msg.equalsIgnoreCase("bukkit:rl")||msg.equalsIgnoreCase("bukkit:reload")) {
				if(!p.hasPermission("bukkit.reload")) {
					p.sendMessage(Language.noperm);
					e.setCancelled(true);
				} else {
					e.setCancelled(true);
					Bukkit.broadcastMessage("§c§l");
					Bukkit.broadcastMessage("§c§lDer Server wird nun neugeladen.");
					Bukkit.broadcastMessage("§c§l");
					Bukkit.broadcastMessage("§c§lBitte nicht bewegen oder bauen. Dies verlängert den Reload und kann zum verbuggen von Items führen. Diese werden nicht ersetzt.");
					Bukkit.broadcastMessage("§c§l");
					Bukkit.reload();
				}
			}
		}
	}
	
	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent e) {
		if(!e.isCancelled()) {
			Player p = e.getPlayer();
			String msg = e.getMessage().split(" ")[0];
			HelpTopic topic = Bukkit.getServer().getHelpMap().getHelpTopic(msg);
			if(topic == null) {
				p.sendMessage(Language.noperm);
				e.setCancelled(true);
			}
		} else {
			Player p = e.getPlayer();
			String msg = e.getMessage().split(" ")[0];
			HelpTopic topic = Bukkit.getServer().getHelpMap().getHelpTopic(msg);
			if(topic == null) {
				p.sendMessage(Language.noperm);
				e.setCancelled(true);
			} 
		}
	}

}

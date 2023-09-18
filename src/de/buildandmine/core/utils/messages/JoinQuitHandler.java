package de.buildandmine.core.utils.messages;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import de.buildandmine.core.commands.admin.vanish;
import de.buildandmine.core.utils.Position;

public class JoinQuitHandler implements Listener{
	
	public void onRespawn(PlayerRespawnEvent e) {
		e.setRespawnLocation(Position.getLocation("Spawn"));
		e.getPlayer().setGameMode(GameMode.SURVIVAL);
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		e.setJoinMessage("");
	}
	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		e.setQuitMessage("");
		Player p = e.getPlayer();
		if(vanish.chat.contains(p)) {
			vanish.chat.remove(p);
		}
		if(vanish.vanished.contains(p)) {
			vanish.vanished.remove(p);
		}
	}
}

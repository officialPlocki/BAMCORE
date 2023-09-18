package de.buildandmine.core.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import de.buildandmine.core.commands.fly;
import de.buildandmine.core.commands.admin.cc;
import de.buildandmine.core.commands.admin.gm;
import de.buildandmine.core.commands.admin.tp;
import de.buildandmine.core.commands.admin.tphere;
import de.buildandmine.core.commands.admin.vanish;
import de.buildandmine.core.utils.API;
import de.buildandmine.core.utils.CommandHandler;
import de.buildandmine.core.utils.chat.ChatHandler;
import de.buildandmine.core.utils.messages.JoinQuitHandler;

public class Main extends JavaPlugin{
	
	private static Plugin main;
	
	public void onEnable() {
		main = this;
		
		getCommand("fly").setExecutor(new fly());
		getCommand("gm").setExecutor(new gm());
		getCommand("tp").setExecutor(new tp());
		getCommand("tphere").setExecutor(new tphere());
		getCommand("vanish").setExecutor(new vanish());
		getCommand("v").setExecutor(new vanish());
		getCommand("gamemode").setExecutor(new gm());
		getCommand("cc").setExecutor(new cc());
		getCommand("clearchat").setExecutor(new cc());
		getCommand("chatclear").setExecutor(new cc());
		
		Bukkit.getPluginManager().registerEvents(new ChatHandler(), this);
		Bukkit.getPluginManager().registerEvents(new JoinQuitHandler(), this);
        Bukkit.getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
		Bukkit.getPluginManager().registerEvents(new CommandHandler(), this);
	}
	
	public static API getAPI() {
		return API.api;
	}
	
	public void onDisable() {
		
	}
	
	public static Plugin getInstance() {
		return main;
	}
	
}

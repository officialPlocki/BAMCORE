package de.buildandmine.core.utils;

import de.buildandmine.core.utils.bungeecord.BungeeCordHandler;

public class API {
	
	public static API api;
	
	public static BungeeCordHandler getBungeeCordHandler() {
		return BungeeCordHandler.handler;
	}
	
	public static ConfigHandler getConfigHandler() {
		return ConfigHandler.handler;
	}
	
	public static Language getLanguage() {
		return Language.handler;
	}
	
	public static Position getPositions() {
		return Position.handler;
	}
	
}

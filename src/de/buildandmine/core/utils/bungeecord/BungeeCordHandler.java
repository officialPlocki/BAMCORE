package de.buildandmine.core.utils.bungeecord;

import org.bukkit.entity.Player;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

import de.buildandmine.core.main.Main;

public class BungeeCordHandler {
	
	public static BungeeCordHandler handler;
	
	public static void sendPlayer(Player p, String server){
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("Connect");
        out.writeUTF(server);
        p.sendPluginMessage(Main.getInstance(), "BungeeCord", out.toByteArray());
    }
}

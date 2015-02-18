package pl.raz4r.permiess.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import pl.raz4r.permiess.Config;

public class PlayerJoin implements Listener {

	@EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
		if(Config.getConfig("Perm").contains("Players." + e.getPlayer().getName()));
		{
			
		}
		else{
			
		}
	}
}

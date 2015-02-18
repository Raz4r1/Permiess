package pl.raz4r.permiess.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import pl.raz4r.permiess.Config;
import pl.raz4r.permiess.data.DataConfig;
import pl.raz4r.permiess.data.DataPerm;

public class PlayerJoin implements Listener {

	@EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
		if(Config.getConfig("Perm").contains("Players." + e.getPlayer().getName()));
		{
			e.setJoinMessage(DataPerm.getWiadomoscGrupy(DataPerm.getGroupPlayer(e.getPlayer().getName())));
		}
	     if(!Config.getConfig("Perm").contains("Players." + e.getPlayer().getName()));
		{
			e.setJoinMessage(DataConfig.getPierwszaWiadomoscPowitalna());
			DataPerm.setGroupPlayer(e.getPlayer().getName(), DataPerm.getDefaultGroup());
		}
	
	}
}

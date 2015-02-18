package pl.raz4r.permiess.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import pl.raz4r.permiess.data.DataConfig;
import pl.raz4r.permiess.data.DataPerm;

public class AsyncPlayerChat implements Listener {
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		e.setFormat(DataConfig.getFormatWiadomosci().toString().replace("%NICK%", e.getPlayer().getName().replace("%GRUPA%", DataPerm.getGroupChatPrefi(DataPerm.getGroupPlayer(e.getPlayer().getName())))));

	}
}

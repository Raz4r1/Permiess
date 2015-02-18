package pl.raz4r.permiess;

import org.bukkit.plugin.java.JavaPlugin;

import pl.raz4r.permiess.listeners.AsyncPlayerChat;
import pl.raz4r.permiess.listeners.BlockPlace;
import pl.raz4r.permiess.listeners.PlayerDeath;
import pl.raz4r.permiess.listeners.PlayerJoin;
import pl.raz4r.permiess.listeners.PlayerQuit;

public class Main extends JavaPlugin {
	
	public static Main getPlugin;
	
	@Override
	public void onEnable()
	{
		getPlugin=this;
		System.out.println("[PERMIESS] Uruchamianie pluginu");
		System.out.println("[PERMIESS] Wczytywanie configu");
		Config.registerConfig("Perm", "Permissions.yml", this);
		Config.registerConfig("Config", "Config.yml", this);
		Config.getConfig("Perm").options().copyDefaults(true);
		Config.getConfig("Config").options().copyDefaults(true);
		Config.getConfig("Perm").addDefault("DomyslnaGrupa", "Gracz");
		Config.getConfig("Perm").addDefault("Gracz.WiadomoscPowitalna", "Witamy na serwerze!");
		Config.getConfig("Perm").addDefault("Gracz.ChatPrefix", "[Gracz]");
		Config.getConfig("Config").addDefault("General.FormatWiadomosci", "<<%GRUPA% %NICK%>>");
		Config.getConfig("Config").addDefault("General.FirstWiadomoscPowitalna", "Witamy nowego gracza na serwerze!");
		Config.saveAll();
		System.out.println("[PERMIESS] Config wczytany");
		System.out.println("[PERMIESS] Uruchamianie wtyczek");
		getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
		getServer().getPluginManager().registerEvents(new AsyncPlayerChat(), this);
		getServer().getPluginManager().registerEvents(new BlockPlace(), this);
		getServer().getPluginManager().registerEvents(new PlayerDeath(), this);
		getServer().getPluginManager().registerEvents(new PlayerQuit(), this);
	}
	@Override
	public void onDisable()
	{
		System.out.println("[PERMIESS] Wylaczanie pluginu");
		System.out.println("[PERMIESS] Zapisywanie configu");
	}

}

package pl.raz4r.permiess;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import pl.raz4r.permiess.listeners.PlayerJoin;

public class Main extends JavaPlugin {
	
	public static Main getPlugin;
	
	@Override
	public void onEnable()
	{
		System.out.println("[PERMIESS] Uruchamianie pluginu");
		System.out.println("[PERMIESS] Wczytywanie configu");
		System.out.println("[PERMIESS] Config wczytany");
		System.out.println("[PERMIESS] Uruchamianie wtyczek");
		getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
		getPlugin=this;
	}
	@Override
	public void onDisable()
	{
		System.out.println("[PERMIESS] Wylaczanie pluginu");
		System.out.println("[PERMIESS] Zapisywanie configu");
	}

}

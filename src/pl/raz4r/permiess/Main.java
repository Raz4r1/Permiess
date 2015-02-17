package pl.raz4r.permiess;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static FileConfiguration getConfig;
	public static Main getPlugin;
	
	@Override
	public void onEnable()
	{
		System.out.println("[PERMIESS] Uruchamianie pluginu");
		System.out.println("[PERMIESS] Wczytywanie configu");
		getPlugin=this;
		getConfig=this.getConfig();
	}
	@Override
	public void onDisable()
	{
		System.out.println("[PERMIESS] Wylaczanie pluginu");
		System.out.println("[PERMIESS] Zapisywanie configu");
	}

}

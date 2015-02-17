package pl.raz4r.permiess;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static FileConfiguration getConfig;
	public static Main getPlugin;
	
	@Override
	public void onEnable()
	{
		getPlugin=this;
		getConfig=this.getConfig();
	}
	@Override
	public void onDisable()
	{
		
	}

}

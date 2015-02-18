package pl.raz4r.permiess.data;

import pl.raz4r.permiess.Config;

public class DataConfig {

	public static String getPierwszaWiadomoscPowitalna()
	{
		return Config.getConfig("Config").getString("Gerneral.FirstWiadomoscPowitalna");
	}
	public static void setPierwszaWiadomoscPowitalna(String w)
	{
		Config.getConfig("Config").set("Gerneral.FirstWiadomoscPowitalna",w);
		Config.save("Config");
	}
}

package pl.raz4r.permiess.data;

import pl.raz4r.permiess.Config;

public class DataConfig {

	public static String getPierwszaWiadomoscPowitalna()
	{
		return Config.getConfig("Config").getString("General.FirstWiadomoscPowitalna");
	}
	public static String getFormatWiadomosci()
	{
		return Config.getConfig("Config").getString("General.FormatWiadomosci");
	}
	public static void setPierwszaWiadomoscPowitalna(String w)
	{
		Config.getConfig("Config").set("General.FirstWiadomoscPowitalna",w);
		Config.save("Config");
	}
	public static void setFormatWiadomosci(String w)
	{
		Config.getConfig("Config").set("General.FormatWiadomosci", w);
		Config.save("Config");
	}
	
}

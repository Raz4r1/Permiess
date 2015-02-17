package pl.raz4r.permiess.data;

import pl.raz4r.permiess.Config;

public class DataPerm {

	public static String getGroupPlayer(String p)
	{
		return Config.getConfig("Perm").getString("Players." + p +".Grupa");
	}
}

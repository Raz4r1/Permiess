package pl.raz4r.permiess.data;

import pl.raz4r.permiess.Config;

public class DataPerm {

	public static String getGroupPlayer(String p)
	{
		return Config.getConfig("Perm").getString("Players." + p +".Grupa");
	}
	public static String getGroupChatPrefi(String g)
	{
		return Config.getConfig("Perm").getString(g+".ChatPrefix");
	}
	public static void setGroupPlayer(String p,String g)
	{
		Config.getConfig("Perm").set("Players." + p + ".Grupa", g);
	}
    public static void setGroupChatPrefix(String g,String prefix)
    {
    	Config.getConfig("Perm").set(g+".ChatPrefix",prefix);
    }
}

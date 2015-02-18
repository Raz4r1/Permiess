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
	public static String getDefaultGroup()
	{
		return Config.getConfig("Perm").getString("DomyslnaGrupa");
	}
	public static void setGroupPlayer(String p,String g)
	{
		Config.getConfig("Perm").set("Players." + p + ".Grupa", g);
		Config.save("Perm");
	}
    public static void setGroupChatPrefix(String g,String prefix)
    {
    	Config.getConfig("Perm").set(g+".ChatPrefix",prefix);
    	Config.save("Perm");
    }
    public static void setDefaultGroup(String g)
    {
    	Config.getConfig("Perm").set("DomyslnaGrupa", g);
    	Config.save("Perm");
    }
}

package me.night;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class NoHit extends JavaPlugin {
	
	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerListener(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
}
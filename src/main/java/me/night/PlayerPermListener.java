package me.night;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class PlayerPermListener implements Listener {

	@EventHandler(priority = EventPriority.NORMAL)
	public void onAttack (EntityDamageByEntityEvent e){
		if(e.getDamager() instanceof Player) {
			if(e.getEntity() instanceof Player) {
				Player attacker = null;
				Player defender = null;
				attacker = (Player) e.getDamager();
				defender = (Player) e.getEntity();
				if(defender.hasPermission("nohit.untouchable")) {
					attacker.kickPlayer(ChatColor.RED + "Please Do Not Hit " + ChatColor.GOLD + defender.getName() + ChatColor.RED + "!");
					defender.sendMessage(ChatColor.BOLD + "[" + ChatColor.GOLD + "NoHit" + ChatColor.RESET + ChatColor.BOLD + "] " + ChatColor.RED + ChatColor.BOLD + "You were hit by " + ChatColor.GOLD + ChatColor.BOLD + attacker.getName() + ChatColor.RED + ChatColor.BOLD + "!");
				}
			}
		}
	}
}
package com.unlucky4ever.removeexp;

import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExpEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.inventory.FurnaceExtractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class RemoveEXP extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new RemoveEXPListener(), this);
	}
	
	public class RemoveEXPListener implements Listener {
		public void onBlockBreak(BlockExpEvent event) {
			event.setExpToDrop(0);
		}
		
		public void onFurnaceExtract(FurnaceExtractEvent event) {
			event.setExpToDrop(0);
		}
		
		public void onEntityDeath(EntityDeathEvent event) {
			event.setDroppedExp(0);
		}
	}
}
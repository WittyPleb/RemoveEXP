package com.unlucky4ever.removeexp;

import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class RemoveEXP extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new EntityListener(), this);
		getServer().getPluginManager().registerEvents(new BlockListener(), this);
	}
	
	public class EntityListener implements Listener {
		public void onEntityDeath(EntityDeathEvent event) {
			event.setDroppedExp(0);
		}
	}
	
	public class BlockListener implements Listener {
		public void onBlockBreak(BlockBreakEvent event) {
			event.setExpToDrop(0);
		}
	}
}
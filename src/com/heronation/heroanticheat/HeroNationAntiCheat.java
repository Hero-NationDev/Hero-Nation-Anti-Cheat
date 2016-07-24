package com.heronation.heroanticheat;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class HeroNationAntiCheat extends JavaPlugin {

	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();

		logger.info(pdfFile.getName() + " has been enabled! (V."
				+ pdfFile.getVersion() + ")");
	}

	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = Logger.getLogger("Minecraft");

		logger.info(pdfFile.getName() + " has been disabled. (V."
				+ pdfFile.getVersion() + ")");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if (label.equalsIgnoreCase("hnac version")) {

			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.RED + "Ah ah ah, no using Command Blocks or Console! -HN Anti-Cheat");
				return false;
			}

			Player player = (Player) sender;
			player.sendMessage(ChatColor.GREEN + "Command succesfully executed! -HN Anti-Cheat");
			return true;
		}
		return false;
	}
}

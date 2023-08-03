package br.com.mxtheuz.mxteleport;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MxTeleport extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("[mx-teleport] Teleporte esta funcionando!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("teleport")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("Este comando so pode ser usado por jogadores.");
                return true;
            }

            Player player = (Player) sender;

            if (args.length < 1) {
                player.sendMessage("Uso: /teleport <localizacao>");
                return true;
            }

            String locationName = args[0];
            World targetLocation = Bukkit.getWorld(locationName); 

            if (targetLocation == null) {
                player.sendMessage("O mundo de destino nao foi encontrado.");
                return true;
            }

            player.teleport(targetLocation.getSpawnLocation());
            player.sendMessage("Voce foi teleportado para " + locationName + ".");

            return true;
        }

        return false;
    }
}

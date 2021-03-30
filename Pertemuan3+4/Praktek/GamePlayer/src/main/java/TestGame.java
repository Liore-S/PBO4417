/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goobe
 */
public class TestGame {
    public static void main(String[] args){     
        GamePlayer player = new GamePlayer();
        player.setDimension(12, 12);
        player.setPosition(10, 220);
        System.out.println("Player Position: "+player.getX()+","+player.getY());
        player.Run(12);
        System.out.println("Player Position: "+player.getX()+","+player.getY());
        
        GamePlayer player2 = new GamePlayer();
        player2.setDimension(12, 32);
        player2.setPosition(10, 10);
        
        GameEnemy enemy = new GameEnemy();
        enemy.setDimension(12, 32);
        enemy.setPosition(10, 10);      
        
        GameEnvironment scene = new GameEnvironment();
        scene.addPlayer(player);
        scene.addPlayer(player);
        scene.addPlayer(player2);
        scene.getAllPlayer();
        scene.removePlayer(player);
        scene.addEnemy(enemy);
        scene.Interaction();
    }
}

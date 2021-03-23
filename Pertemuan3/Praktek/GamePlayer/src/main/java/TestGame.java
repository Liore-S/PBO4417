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
        GamePlayer player = new GamePlayer(20,30,5,5);
        GameEnemy enemy = new GameEnemy(20,30,65,65);
        
        player.Run();
        player.Run(20);
        player.Run();
        player.Run(30);
        
        enemy.Run();
    }
}

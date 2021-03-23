/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goobe
 */
public class GamePlayer {
    private double width;
    private double height;
    private int positionX;
    private int positionY;
    
    GamePlayer(){
        this.width = 20;
        this.height = 40;
        this.positionX = 10;
        this.positionY = 30;
    };
    GamePlayer(double width,double height){
        this.width = width;
        this.height = height;
    };
    GamePlayer(double width,double height,int positionX,int positionY){
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    };
    public void setDimension(int width,int height){
        this.width = width;
        this.height = height;
    };
    public void setPosition(int positionX,int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    };
    public double getWidth(){
        return this.width;
    };
    public double getHeight(){
        return this.height;
    };
    public int getX(){
        return this.positionX;
    };
    public int getY(){
        return this.positionY;
    };
    public void Run(){
        System.out.println("Player is running...");
    };
    public void Run(int incerementX){
         this.positionX+=incerementX;
         System.out.println("Player still running...current X position = "+
                 this.positionX);
    };
}

package snk.mechanic;

import snk.gui.ScreenSettings;
import snk.gui.mainScreen.Main;

public class MainLoop {

    public boolean gameRunning = true;

    Main mainScreen = new Main();

    public MainLoop(){
        while(gameRunning==true){
            for(int i =mainScreen.gameField.snakeParts.size()-1;i>0;i--){
                mainScreen.gameField.snakeParts.get(i).snakeX=mainScreen.gameField.snakeParts.get(i-1).snakeX;
                mainScreen.gameField.snakeParts.get(i).snakeY=mainScreen.gameField.snakeParts.get(i-1).snakeY;
            }
            if(mainScreen.sidePanel.arrows.isMovingRight()) {
                mainScreen.gameField.snakeParts.get(0).snakeX +=ScreenSettings.elementWidth/2;
            }
            if(mainScreen.sidePanel.arrows.isMovingDown()){
                mainScreen.gameField.snakeParts.get(0).snakeY+=ScreenSettings.elementHeight/2;
            }
            if(mainScreen.sidePanel.arrows.isMovingLeft()){
                mainScreen.gameField.snakeParts.get(0).snakeX-=ScreenSettings.elementWidth/2;
            }
            if(mainScreen.sidePanel.arrows.isMovingUp()){
                mainScreen.gameField.snakeParts.get(0).snakeY-=ScreenSettings.elementHeight/2;
            }
            mainScreen.repaint();
            try {
                Thread.sleep(500);
            }catch(InterruptedException e){}
        }
    }
}

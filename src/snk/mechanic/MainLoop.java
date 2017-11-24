package snk.mechanic;

import snk.gui.ScreenSettings;
import snk.gui.mainScreen.Main;

public class MainLoop {

    public boolean gameRunning = true;

    Main mainScreen = new Main();

    public MainLoop(){
        while(gameRunning==true){
            if(mainScreen.sidePanel.arrows.isMovingRight()) {
                mainScreen.gameField.snakePart.snakeX +=ScreenSettings.elementWidth/2;
            }
            if(mainScreen.sidePanel.arrows.isMovingDown()){
                mainScreen.gameField.snakePart.snakeY+=ScreenSettings.elementHeight/2;
            }
            if(mainScreen.sidePanel.arrows.isMovingLeft()){
                mainScreen.gameField.snakePart.snakeX-=ScreenSettings.elementWidth/2;
            }
            if(mainScreen.sidePanel.arrows.isMovingUp()){
                mainScreen.gameField.snakePart.snakeY-=ScreenSettings.elementHeight/2;
            }
            mainScreen.repaint();
            System.out.println(mainScreen.gameField.snakePart.snakeX);
            try {
                Thread.sleep(500);
            }catch(InterruptedException e){}
        }
    }
}

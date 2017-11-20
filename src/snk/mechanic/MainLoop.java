package snk.mechanic;

import snk.gui.ScreenSettings;
import snk.gui.mainScreen.Main;

public class MainLoop {

    public boolean gameRunning = true;

    //moving direction
    public boolean movingUp =false;
    public boolean movingDown= false;
    public boolean movingRight = false;
    public boolean movingLeft = false;


    Main mainScreen = new Main();

    public MainLoop(){
        while(gameRunning==true){

            mainScreen.gameField.snakePart.snakeX=mainScreen.gameField.snakePart.snakeX+ ScreenSettings.elementWidth/2;
            mainScreen.repaint();
            System.out.println(mainScreen.gameField.snakePart.snakeX);
            try {
                Thread.sleep(500);
            }catch(InterruptedException e){}
        }
    }

}

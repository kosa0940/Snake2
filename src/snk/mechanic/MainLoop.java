package snk.mechanic;

import snk.gui.ScreenSettings;
import snk.gui.mainScreen.Main;

public class MainLoop {

    public boolean gameRunning = true;

    //moving direction
    private boolean movingUp =false;
    private boolean movingDown= false;
    private boolean movingRight = true;
    private boolean movingLeft = false;


    Main mainScreen = new Main();

    public MainLoop(){
        while(gameRunning==true){
            if(movingRight) {
                mainScreen.gameField.snakePart.snakeX +=ScreenSettings.elementWidth/2;
            }
            if(movingDown){
                mainScreen.gameField.snakePart.snakeY+=ScreenSettings.elementHeight/2;
            }
            if(movingLeft){
                mainScreen.gameField.snakePart.snakeX-=ScreenSettings.elementWidth/2;
            }
            if(movingUp){
                mainScreen.gameField.snakePart.snakeY-=ScreenSettings.elementHeight/2;
            }
            mainScreen.repaint();
            System.out.println(mainScreen.gameField.snakePart.snakeX);
            try {
                Thread.sleep(500);
            }catch(InterruptedException e){}
        }
    }

    public void setMovingUp(boolean movingUp) {
        this.movingUp = movingUp;
    }

    public void setMovingDown(boolean movingDown) {
        this.movingDown = movingDown;
    }

    public void setMovingRight(boolean movingRight) {
        this.movingRight = movingRight;
    }

    public void setMovingLeft(boolean movingLeft) {
        this.movingLeft = movingLeft;
    }
}

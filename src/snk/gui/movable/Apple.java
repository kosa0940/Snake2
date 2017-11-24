package snk.gui.movable;

import snk.gui.ScreenSettings;
import snk.gui.mainScreen.GameField;

import java.awt.*;

public class Apple{

    Color appleColor = new Color(129, 19, 15);

    private int appleXParameter,appleYParameter;

    public Apple(){
    };

    public void paint(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(appleColor);
        g2.fillRect(appleXParameter,appleYParameter, ScreenSettings.elementWidth/2,ScreenSettings.elementHeight/2);

    }

    public void applePostitionRandomizer(SnakePart[] snakeParts){

        double applePositionX,applePositionY;
        applePositionX = Math.random()*27;
        applePositionY = Math.random()*17;
        for(int i=0;i<snakeParts.length;i++){
            if(snakeParts[i].snakeX==(int)applePositionX&&snakeParts[i].snakeY==(int)applePositionY){
                applePostitionRandomizer(snakeParts);
            }
        }

        appleXParameter=(int)applePositionX;
        appleYParameter=(int)applePositionY;

    }

}

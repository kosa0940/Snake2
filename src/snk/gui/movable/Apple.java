package snk.gui.movable;

import snk.gui.ScreenSettings;
import java.awt.*;
import java.util.ArrayList;

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

    public void applePostitionRandomizer(ArrayList<SnakePart> snakeParts){

        double applePositionX,applePositionY;
        applePositionX = 0;
        applePositionY = 0;
        for(int i=0;i<snakeParts.size();i++){
            if(snakeParts.get(i).snakeX==(int)applePositionX&&snakeParts.get(i).snakeY==(int)applePositionY){
                applePostitionRandomizer(snakeParts);
            }
        }
        appleXParameter=(int)applePositionX;
        appleYParameter=(int)applePositionY;
    }
}

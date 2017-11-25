package snk.gui.movable;

import snk.gui.ScreenSettings;
import snk.gui.mainScreen.GameField;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Apple{

    Color appleColor = new Color(129, 19, 15);

    public int appleXParameter,appleYParameter;

    public Apple(){
    };

    public void paint(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(appleColor);
        g2.fillRect(appleXParameter,appleYParameter, GameField.gameFieldWidth/26,GameField.gameFieldHeight/16);

    }

    public void applePostitionRandomizer(ArrayList<SnakePart> snakeParts){

        double applePositionX,applePositionY;
        applePositionX = Math.random()*27;
        applePositionY = Math.random()*17;
        for(int i=0;i<snakeParts.size();i++){
            if(snakeParts.get(i).snakeX==(int)applePositionX&&snakeParts.get(i).snakeY==(int)applePositionY){
                applePostitionRandomizer(snakeParts);
            }
        }
        appleXParameter=GameField.gameFieldWidth/26*(int)applePositionX;
        appleYParameter=GameField.gameFieldHeight/16*(int)applePositionY;

        System.out.println("Apple x y:"+appleXParameter+"  "+appleYParameter);
    }
}

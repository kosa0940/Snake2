package snk.gui.movable;

import snk.gui.ScreenSettings;

import javax.swing.*;
import java.awt.*;

public class SnakePart extends JPanel{

    public int snakeX=0;
    public int snakeY=0;

    private static Color snakeColor = new Color(11, 189, 0);

    public SnakePart(){

        setLayout(null);

    }


    public void paint(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(snakeColor);
        g2.fillRect(snakeX,snakeY, ScreenSettings.elementWidth/2,ScreenSettings.elementHeight/2);

    }

}

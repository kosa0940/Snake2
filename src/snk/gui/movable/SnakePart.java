package snk.gui.movable;

import snk.gui.ScreenSettings;

import javax.swing.*;
import java.awt.*;

public class SnakePart extends JPanel{

    public int snakeX=0;
    public int snakeY=0;

    public SnakePart(){

        setLayout(null);
        setBounds(snakeX,snakeY,ScreenSettings.elementWidth,ScreenSettings.screenHeight);

    }


    public void paint(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.black);
        g2.fillRect(0,0, ScreenSettings.elementWidth/2,ScreenSettings.elementHeight/2);

    }

}

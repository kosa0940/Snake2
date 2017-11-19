package snk.gui.mainScreen;

import snk.gui.ScreenSettings;
import snk.gui.movable.SnakePart;

import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel{

    //Panel look
    private static Color backgroundColor = new Color(23, 156, 29);

    //panel bounds
    private static int gameFieldWidth= ScreenSettings.elementWidth*14;
    private static int gameFieldHeight=ScreenSettings.elementHeight*7;

    //draw starting position
    private static int panelX=0;
    private static int panelY=ScreenSettings.elementHeight;

    //Objects
    SnakePart snakePart = new SnakePart();

    public GameField(){

        setLayout(null);
        setBounds(panelX,panelY,gameFieldWidth,gameFieldHeight);

        snakePart.setBounds(0,0,100,100);

        add(snakePart);

    }

    public void paint(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(backgroundColor);
        g2.fillRect(0,0,ScreenSettings.elementWidth,ScreenSettings.screenHeight);

        g2.setColor(Color.black);

        snakePart.paint(g2);

    }

}

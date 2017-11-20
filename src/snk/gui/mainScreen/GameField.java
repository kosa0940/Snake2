package snk.gui.mainScreen;

import snk.gui.ScreenSettings;
import snk.gui.movable.SnakePart;

import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel{

    //Panel look
    private static Color backgroundColor = new Color(0, 9, 87);

    //panel bounds
    private static int gameFieldWidth= ScreenSettings.elementWidth*13;
    private static int gameFieldHeight=ScreenSettings.elementHeight*8;

    //Location
    private static int panelX=0;
    private static int panelY=ScreenSettings.elementHeight/2;

    //Panels and components
    SnakePart snakePart = new SnakePart();

    public GameField(){

        setLayout(null);
        setBounds(panelX,panelY,gameFieldWidth,gameFieldHeight);

        snakePart.setBounds(0,0,gameFieldWidth,gameFieldHeight);

        add(snakePart);

    }

    public void paint(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(backgroundColor);
        g2.fillRect(0,0,gameFieldWidth,gameFieldHeight);

        g2.setColor(Color.black);

        snakePart.paint(g2);

    }

}

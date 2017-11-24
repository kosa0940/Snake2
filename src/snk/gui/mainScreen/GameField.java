package snk.gui.mainScreen;

import snk.gui.ScreenSettings;
import snk.gui.movable.SnakePart;

import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel{

    //Panel look
    private static Color backgroundColor = new Color(0, 9, 87);

    //panel bounds
    public static int gameFieldWidth= ScreenSettings.elementWidth*13;
    public static int gameFieldHeight=ScreenSettings.elementHeight*8;

    //Location
    public static int panelX=0;
    public static int panelY=ScreenSettings.elementHeight/2;

    //Panels and components
    public SnakePart snakePart = new SnakePart();

    public GameField(){

        setLayout(null);
        setBounds(panelX,panelY,gameFieldWidth,gameFieldHeight-9);

        add(snakePart);

    }

    public void paint(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(backgroundColor);
        g2.fillRect(0,0,gameFieldWidth,gameFieldHeight-9);

        g2.setColor(Color.black);

        snakePart.paint(g2);

    }

}

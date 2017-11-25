package snk.gui.mainScreen;

import snk.gui.ScreenSettings;
import snk.gui.movable.Apple;
import snk.gui.movable.SnakePart;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

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
    private SnakePart head = new SnakePart();
    private SnakePart body1 = new SnakePart();
    private SnakePart body2 = new SnakePart();

    Apple apple = new Apple();

    public ArrayList<SnakePart> snakeParts= new ArrayList<SnakePart>();

    public GameField(){

        setLayout(null);
        setBounds(panelX,panelY,gameFieldWidth,gameFieldHeight-9);

        body1.snakeX=panelX+ScreenSettings.elementWidth;
        head.snakeX=panelY+ScreenSettings.elementHeight;

        apple.applePostitionRandomizer(snakeParts);

        snakeParts.add(head);
        snakeParts.add(body1);
        snakeParts.add(body2);

        for(int i=0;i<snakeParts.size();i++) {
            add(snakeParts.get(i));
        }

    }

    public void paint(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(backgroundColor);
        g2.fillRect(0,0,gameFieldWidth,gameFieldHeight-9);

        g2.setColor(Color.black);

        for(int i=0;i<snakeParts.size();i++) {
        snakeParts.get(i).paint(g2);
        }
       apple.paint(g2);
    }

}

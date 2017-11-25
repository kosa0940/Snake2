package snk.gui.movable;

import snk.gui.ScreenSettings;
import snk.gui.mainScreen.GameField;

import javax.swing.*;
import java.awt.*;

public class SnakePart extends JPanel{

    public int snakeX= GameField.panelX;
    public int snakeY= GameField.panelY;

    private static Color snakeColor = new Color(11, 189, 0);

    public SnakePart(){

        setLayout(null);

    }

    public void paint(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(snakeColor);
        g2.fillRect(snakeX-1,snakeY, GameField.gameFieldWidth/26,GameField.gameFieldHeight/16);

    }

}

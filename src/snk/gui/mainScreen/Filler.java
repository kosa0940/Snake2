package snk.gui.mainScreen;

import snk.gui.ScreenSettings;

import javax.swing.*;
import java.awt.*;

public abstract class Filler extends JPanel{

    int x,y,width= GameField.gameFieldWidth,height=ScreenSettings.elementHeight;
    Color color = new Color(100,100,100);

    public Filler(){
        setBounds(x,y,width,height);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}

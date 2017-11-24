package snk.gui.mainScreen;

import snk.gui.ScreenSettings;

import java.awt.*;

public class BottomFiller extends Filler{

    public BottomFiller(){

        setBounds(0,GameField.panelY+GameField.gameFieldHeight-9, ScreenSettings.screenWidth,ScreenSettings.elementHeight);

    }

    public void paint(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(super.color);
        g2.fillRect(super.x,super.y-9,super.width,super.height);

    }

}

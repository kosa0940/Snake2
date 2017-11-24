package snk.gui.mainScreen;

import java.awt.*;

public class TopFiller extends Filler{

    public TopFiller(){

        super.x= 0;
        super.y= 0;

    }

    public void paint(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(super.color);
        g2.fillRect(super.x,super.y,super.width,super.height);

    }

}

package snk.gui.sideBar;

import snk.gui.ScreenSettings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ControlArrows extends JPanel{

    private JButton up,down,left,right;
    private Font arrowsFont = new Font("Dialog",0,30);

    private ControlArrows(){

        setBackground(Color.black);
        setBounds(SidePanel.xlocation,SidePanel.yLocation, ScreenSettings.elementHeight*3,ScreenSettings.elementWidth*2);
        setLayout(null);

        //Buttons inicjalization
        up= new JButton("^");
        down=new JButton("v");
        left=new JButton("<");
        right=new JButton(">");

        up.setFont(arrowsFont);
        down.setFont(arrowsFont);
        left.setFont(arrowsFont);
        right.setFont(arrowsFont);

        up.setBounds(ScreenSettings.elementWidth,0,ScreenSettings.elementWidth,ScreenSettings.elementHeight);
        down.setBounds(ScreenSettings.elementWidth,ScreenSettings.elementHeight,ScreenSettings.elementWidth,ScreenSettings.elementHeight);
        left.setBounds(0,ScreenSettings.elementHeight,ScreenSettings.elementWidth,ScreenSettings.elementHeight);
        right.setBounds(ScreenSettings.elementWidth*2,ScreenSettings.elementHeight,ScreenSettings.elementWidth,ScreenSettings.elementHeight);

        //Panel Components
        add(up);
        add(down);
        add(left);
        add(right);


    }

}

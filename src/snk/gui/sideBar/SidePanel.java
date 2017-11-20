package snk.gui.sideBar;

import snk.gui.ScreenSettings;

import javax.swing.*;
import java.awt.*;

public class SidePanel extends JPanel{

    //Buttons look
    private Font buttonFont = new Font("Dialog",0,24);

    //Arrows location (2x3 elemnt)
    public static int xlocation =0;
    public static int yLocation=5*ScreenSettings.elementHeight;

    //Components Declaration
    JButton start,recTab,exit;
    ControlArrows arrows = new ControlArrows();

    //Components Localization
    private static int separation = ScreenSettings.elementHeight/2;
    private static int buttonWidth = ScreenSettings.elementHeight*3;
    private static int buttonHeight = ScreenSettings.elementHeight;

    //Panel Location
    private static int panelX=ScreenSettings.elementWidth*13;
    private static int panelY=0;
    private static int panelWidth=ScreenSettings.elementWidth*3;
    private static int panelHeight=ScreenSettings.elementHeight*9;

    public SidePanel(){

        //Panel look and loaction
        setLayout(null);
        setBackground(Color.black);
        setBounds(panelX,panelY,panelWidth,panelHeight);

        //Components inicjalization
        start = new JButton("Start");
        recTab = new JButton("Tablica wyników");
        exit = new JButton("Zamknij Program");

        //Components look
        start.setFont(buttonFont);
        exit.setFont(buttonFont);
        recTab.setFont(buttonFont);

        //Components Localization
        start.setBounds(0,separation,buttonWidth,buttonHeight);
        recTab.setBounds(0,separation*4,buttonWidth,buttonHeight);
        exit.setBounds(0,separation*7,buttonWidth,buttonHeight);

        //Panel build
        add(start);
        add(exit);
        add(recTab);
        add(arrows);
    }

}

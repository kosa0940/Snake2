package snk.gui.sideBar;

import snk.gui.ScreenSettings;
import snk.gui.mainScreen.GameField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SidePanel extends JPanel implements ActionListener{

    //Buttons look
    private Font buttonFont = new Font("Dialog",0,24);

    //Arrows location (2x3 elemnt)
    public static int xlocation =0;
    public static int yLocation=5*ScreenSettings.elementHeight;

    //Components Declaration
    JButton start,recTab,exit;
    public ControlArrows arrows = new ControlArrows();

    //Components Localization
    private static int separation = ScreenSettings.elementHeight/2;
    private static int buttonWidth = ScreenSettings.screenWidth- GameField.gameFieldWidth+16;
    private static int buttonHeight = ScreenSettings.elementHeight;

    //Panel Location
    private static int panelX=ScreenSettings.elementWidth*13-16;
    private static int panelY=0;
    private static int panelWidth =ScreenSettings.screenWidth- GameField.gameFieldWidth+16;
    private static int panelHeight=ScreenSettings.screenHeight;

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

        //ActionListeners
        exit.addActionListener(this);

        //Panel build
        add(start);
        add(exit);
        add(recTab);
        add(arrows);
    }

        public void actionPerformed(ActionEvent evt){

            Object source = evt.getSource();
            if(source==exit){
                System.exit(0);
            }

        }

}

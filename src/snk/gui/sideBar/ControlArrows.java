package snk.gui.sideBar;

import snk.gui.ScreenSettings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlArrows extends JPanel implements ActionListener{

    private JButton up,down,left,right;
    private Font arrowsFont = new Font("Dialog",0,30);

    private boolean movingUp =false;
    private boolean movingDown= false;
    private boolean movingRight = true;
    private boolean movingLeft = false;

    public ControlArrows(){

        setBackground(Color.black);
        setBounds(SidePanel.xlocation+10,SidePanel.yLocation, ScreenSettings.elementHeight*3,ScreenSettings.elementWidth*2);
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

        //ActionListeners
        up.addActionListener(this);
        down.addActionListener(this);
        left.addActionListener(this);
        right.addActionListener(this);

        //Panel Components
        add(up);
        add(down);
        add(left);
        add(right);

    }

    public void actionPerformed(ActionEvent evt){
            Object source = evt.getSource();
                 if(source==up){
                movingUp=true;
                movingDown=false;
                movingLeft=false;
                movingDown=false;
            }
                 if(source==down){
                movingDown=true;
                movingUp=false;
                movingRight=false;
                movingLeft=false;
            }
                 if(source==left){
                movingLeft=true;
                movingUp=false;
                movingDown=false;
                movingRight=false;
            }
                 if(source==right){
                movingRight=true;
                movingUp=false;
                movingDown=false;
                movingLeft=false;
            }
    }
    public boolean isMovingUp() {
        return movingUp;
    }

    public boolean isMovingDown() {
        return movingDown;
    }

    public boolean isMovingRight() {
        return movingRight;
    }

    public boolean isMovingLeft() {
        return movingLeft;
    }
}
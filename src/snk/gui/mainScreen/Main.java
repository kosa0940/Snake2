//Main Frame there all components will be added

package snk.gui.mainScreen;

import snk.gui.ScreenSettings;

import javax.swing.*;

public class Main extends JFrame{

    public Main(){

        super("Snake Paweł Kośnica (unplayable)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Look Setting
        setLayout(null);
        setBounds(0,0, ScreenSettings.screenWidth,ScreenSettings.screenHeight);
        setUndecorated(true);

        setVisible(true);


    }

}

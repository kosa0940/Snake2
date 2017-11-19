//Main Frame there all components will be added

package snk.gui.mainScreen;

import snk.gui.ScreenSettings;

import javax.swing.*;

public class Main extends JFrame{

    private GameField gameField = new GameField();

    public Main(){

        super("Snake Paweł Kośnica (unplayable)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Look Setting
        setLayout(null);
        setUndecorated(true);

        ScreenSettings.device.setFullScreenWindow(this);

        gameField.setBounds(0,0,1000,1000);
        add(gameField);

        setVisible(true);


    }

}

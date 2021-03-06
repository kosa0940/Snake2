//Main Frame there all components will be added

package snk.gui.mainScreen;

import snk.gui.ScreenSettings;
import snk.gui.sideBar.SidePanel;

import javax.swing.*;

public class Main extends JFrame{

    public GameField gameField = new GameField();
    public SidePanel sidePanel = new SidePanel();

    public Main(){

        super("Snake Paweł Kośnica (unplayable)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Look Setting
        setLayout(null);
        setUndecorated(true);

        ScreenSettings.device.setFullScreenWindow(this);

        add(sidePanel);
        add(gameField);
        add(new TopFiller());
        add(new BottomFiller());

        setVisible(true);


    }

}

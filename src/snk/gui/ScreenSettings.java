package snk.gui;

import java.awt.*;

public class ScreenSettings {

    //Graphics display objects
    private static GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
    public static GraphicsDevice device = env.getDefaultScreenDevice();

    //ScreenSize
    public static int screenWidth = (int) env.getMaximumWindowBounds().getWidth();
    public static int screenHeight = (int) env.getMaximumWindowBounds().getHeight()+40;

    public static int elementWidth = screenWidth/16;
    public static int elementHeight = screenHeight/9;
}

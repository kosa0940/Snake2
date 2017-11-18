package snk.gui;

import java.awt.*;

public class ScreenSettings {

    //Graphics display objects
    private static GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
    private static GraphicsDevice device = env.getDefaultScreenDevice();

    //ScreenSize
    public static int screenWidth=(int)env.getMaximumWindowBounds().getWidth();
    public static int screenHeight=(int) env.getMaximumWindowBounds().getHeight();

    public static double ratio = (double)screenWidth/screenHeight;

    //Display mode
    public static DisplayMode displayMode = new DisplayMode(screenWidth,screenHeight,16,DisplayMode.REFRESH_RATE_UNKNOWN);



    public static void main(String[] args){
        System.out.println(screenHeight);
        System.out.println(screenWidth);
        System.out.println(ratio);
    }

}

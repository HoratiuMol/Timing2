package Main;

import Main.Resources;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Scanner;

public class GameMain {

    private static final String Game_Title= "Striking Timing";
    public static final int Width=800;
    public static final int Heigh=450;
    public static Game sGame;


    public static void main(String[] args){
        JFrame frame=new JFrame(Game_Title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        sGame=new Game(Width, Heigh);
        frame.add(sGame);
        frame.pack();
        frame.setVisible(true);
        frame.setIconImage(Resources.iconimage);
    }
}

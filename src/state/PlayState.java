package state;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import Main.GameMain;
import Main.Resources;

import java.util.Scanner;
import util.RandomNumberGenerator;

public class PlayState extends State {
    @Override
    public void init() {

    }

  //  @Override
   // public void main() {

    //}

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        //background
        g.setColor(Resources.darkBlue);
        g.fillRect(0,0,GameMain.Width, GameMain.Heigh);
        g.setColor(Resources.darkRed);
        g.fillRect(GameMain.Width/2,0,GameMain.Width/2,GameMain.Heigh);
    }

    @Override
    public void onClick(MouseEvent e) {

    }

    @Override
    public void onKeyPress(KeyEvent e) {

    }

    @Override
    public void onKeyRelease(KeyEvent e) {

    }
}

package state;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import Main.GameMain;


public abstract class State {
    public abstract void init();
   // public abstract void main();
    public abstract void update();
    public abstract void render(Graphics g);
    public abstract void onClick(MouseEvent e);
    public abstract void onKeyPress(KeyEvent e);
    public abstract void onKeyRelease(KeyEvent e);
    public void setCurrentState(State newState){
        GameMain.sGame.setCurrentState(newState);
    }
}

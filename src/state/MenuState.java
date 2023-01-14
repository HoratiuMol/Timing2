package state;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Main.GameMain;
import Main.Resources;


public class MenuState extends State implements ActionListener{

    @Override
    public void init() {
        System.out.println("Entered MenuState");

    }

    //@Override
    //public void main() {

  //  }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Resources.welcome,0,0,null);
        Button b=new Button("Start");
        b.setBounds(350,30,100,300);
        GameMain.sGame.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b.setVisible(false);
                setCurrentState(new PlayState());
                return;
            }
        });

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

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

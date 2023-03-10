package Main;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import static javax.imageio.ImageIO.read;

public class Resources {
    public static BufferedImage iconimage, welcome;
    public static AudioClip beep;
    public static Color darkBlue, darkRed;

    public static void load(){
        welcome=loadImage("welcome.jpg");
        iconimage = loadImage("iconimage.jpg");
        beep = loadSound("beep.wav");
        darkBlue=new Color(25,83,105);
        darkRed=new Color(105,13,13);
    }

    private static AudioClip loadSound(String filename){
        URL fileURL=Resources.class.getResource("/Resources"+ filename);
        return Applet.newAudioClip(fileURL);
    }

    private static BufferedImage loadImage(String filename){
        BufferedImage img=null;
        try{
            img= ImageIO.read(Resources.class.getResourceAsStream("/Resources"+ filename));
        }catch (IOException e){
            System.out.println("Error while reading" + filename);
            e.printStackTrace();
        }
        return img;
    }
}

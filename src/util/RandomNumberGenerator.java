package util;
import java.util.Random;

public class RandomNumberGenerator {

    private static Random rand=new Random();

    public static int getRandInBetween(int loweBound, int upperBound){
        return rand.nextInt();
    }

    public static int gerRandInt(int upperBound)
    {
        return rand.nextInt();
    }
}

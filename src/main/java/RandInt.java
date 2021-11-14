import java.util.Random;

public class RandInt {

    public static int randInt(int min, int max){

        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        return i += min;
    }
}

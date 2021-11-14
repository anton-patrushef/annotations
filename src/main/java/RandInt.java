import java.util.Random;

public class RandInt {

    public static int randInt(int min, int max){

        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        return i += min;
    }

    public static String randString(int length, String register){

        //a-z 097-122
        //A-Z 065-090
        int min;
        int max;

        if(register.equals("up")){
            min = 65;
            max = 90;
        }else{ // "low"
            min = 97;
            max = 122;
        }

        System.out.println(min + ", " + max);
        char[] resultString = new char[length];

        for (int i = 0; i < length; i++) {
            resultString[i] = (char) randInt(min, max);
        }
        return String.valueOf(resultString);
    }
}



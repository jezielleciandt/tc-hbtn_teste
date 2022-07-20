import java.util.ArrayList;
import java.util.Arrays;

public class Pessoa {
    public static boolean emailValid(String email) {
        String[] arrayOfString = email.split("");
        ArrayList<String> listOfString = new ArrayList<>(Arrays.asList(arrayOfString));

        if (listOfString.contains("@") && listOfString.size()<=50){
            return true;
        }
        return false;
    }
}

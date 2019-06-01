package Test;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class StringLength3Test {
    public static void main(String[] args) {
        System.out.println(isStringLengthIs3("Hello"));
    }

    public static boolean isStringLengthIs3(String str) {
        if (str.length() == 3){
            return true;
        }
        else {
            return false;
        }
    }
}

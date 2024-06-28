import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TheClass testObj = new TheClass();
        Object[] arr = {1, "123", 3L, BigDecimal.valueOf(4), new StringBuilder("5")};

        System.out.println(Arrays.toString(Methods.filter(arr, testObj)));


    }
}
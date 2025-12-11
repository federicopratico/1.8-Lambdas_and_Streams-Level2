package Level2;

import java.util.Arrays;

import static Level2.Ex1.print;

public class Ex2 {
    public static String [] integerListToStringList(Integer [] l) {
        return Arrays.stream(l)
                .map(integer -> ((integer%2 == 0) ? "e":"o") + Integer.toString(integer))
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        Integer [] ints = {3, 55, 44};
        String [] res = integerListToStringList(ints);

        print(System.out::print, ints);
        print(System.out::print, res);
    }
}

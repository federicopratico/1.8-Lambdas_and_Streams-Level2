package Level1;

import java.util.Arrays;
import java.util.Comparator;

import static Level1.Ex1.MyPrintForArrays;
import static java.lang.System.out;

public class Ex6 {
    public static void main(String[] args) {
        String [] words = {"apple", "rocket", "ocean", "guitar", "elephant", "lighthouse", "tornado", "diamond", "cactus", "wizard"};
        MyPrintForArrays(out::print, words);

        Arrays.sort(words, Comparator.comparing(String::length));
        MyPrintForArrays(out::print, words);
    }
}

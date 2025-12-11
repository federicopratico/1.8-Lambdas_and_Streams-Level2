package Level1;

import java.util.Arrays;

import static Level1.Ex1.MyPrintForArrays;
import static java.lang.System.out;

public class Ex2 {
    public static void main(String[] args) {

        String [] words = {"Open", "the", "Door", "Then", "close", "the", "window", "Computer"};
        String [] wordsWithO = Arrays.stream(words)
                .filter((s -> s.toLowerCase().contains("o") &&  s.length() > 5))
                .toArray(String[]::new);

        MyPrintForArrays(out::print, words);
        MyPrintForArrays(out::print, wordsWithO);
    }
}

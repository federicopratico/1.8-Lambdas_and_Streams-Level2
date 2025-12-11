package Level1;

import java.util.Arrays;
import java.util.function.Consumer;

import static java.lang.System.out;

public class Ex1 {

    public static void MyPrintForArrays(Consumer<String> c, String [] s) {
        out.print("[");
        for(int i = 0; i < s.length; i++) {
            c.accept(s[i]);
            if(i < s.length-1) out.print(", ");
        }
        out.println("]");
    }

    public static void main(String[] args) {

        String [] words = {"Open", "the", "Door", "Then", "close", "the", "window"};
        String [] wordsWithO = Arrays.stream(words)
                .filter(s -> s.toLowerCase().contains("o"))
                .toArray(String[]::new);

        MyPrintForArrays(out::print, words);
        MyPrintForArrays(out::print, wordsWithO);
    }
}

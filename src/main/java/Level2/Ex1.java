package Level2;

import java.util.Arrays;
import java.util.function.Consumer;

import static java.lang.System.out;

public class Ex1 {

    public static String [] filter(String [] names) {
        return Arrays.stream(names)
                .filter(s -> s.startsWith("A") && s.length() == 3)
                .toArray(String[]::new);
    }

    public static <T> void print(Consumer<T> c, T [] s){
        out.print("[");
        for(int i = 0; i < s.length; i++) {
            c.accept(s[i]);
            if(i < s.length-1) out.print(", ");
        }
        out.println("]");
    }

    public static void main(String[] args) {
        String [] names = {"James", "Charlotte", "Benjamin", "Amelia", "Henry", "Mia", "Alexander", "Harper", "William", "Evelyn"};
        String [] filteredNames = filter(names);

        print(out::print, names);
        print(out::print, filteredNames);
    }

}

package Level2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static Level2.Ex1.print;
import static java.lang.System.out;

public class Ex4 {

    public static void main(String[] args) {
        String [] list = {"apple", "rocket", "ocean", "guitar", "elephant", "lighthouse", "tornado", "diamond", "cactus", "wizard",
                "James", "Charlotte", "Benjamin", "Amelia", "Henry", "Mia", "Alexander", "Harper", "William", "Evelyn", "144"};

        print(out::print, list);

        Arrays.sort(list, (s1,s2) -> Character.compare(s1.charAt(0), s2.charAt(0)));
        print(out::print, list);

        Arrays.sort(list, Comparator.comparing(s -> !s.contains("e")));
        print(out::print, list);

        List<String> withoutA = Arrays.stream(list).map(s -> s.toLowerCase().replace("a", "4")).toList();
        out.println(withoutA);

        List<String> numerics = withoutA.stream().filter(s -> s.matches("\\d+")).toList();
        out.println(numerics);

    }
}

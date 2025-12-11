package Level1.Ex8;

public class Main {
    public static void main(String[] args) {
        Reverse r = (s) -> new StringBuilder(s).reverse().toString();

        String s = "Hello World!";
        System.out.println(s);
        System.out.println(r.reverse(s));
    }
}

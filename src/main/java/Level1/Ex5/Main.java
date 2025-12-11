package Level1.Ex5;

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface i = () -> 3.1415;

        System.out.println("The result of getPiValue() invocation: " + i.getPiValue());
    }
}

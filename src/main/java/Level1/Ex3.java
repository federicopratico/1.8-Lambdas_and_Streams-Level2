package Level1;

import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        Arrays.stream(months).forEach(s -> System.out.println(s));
    }
}

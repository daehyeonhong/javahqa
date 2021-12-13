package _004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        List<Integer> binary = new ArrayList<>();
        while (inputNumber > 0) {
            binary.add(inputNumber % 2);
            inputNumber /= 2;
        }
        Collections.reverse(binary);
        for (Integer integer : binary)
            System.out.print(integer);
    }

}

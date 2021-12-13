package _003;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputNumbers = new int[10];
        int[] mode = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            System.out.println("숫자를 입력하세요 : " + (inputNumbers.length - i));
            int number = scanner.nextInt();
            inputNumbers[i] = number;
            mode[number]++;
        }
        System.out.println("mode = " + mode);
        for (int i : mode) {
            System.out.println("i = " + i);
        }
        int max = 0;
        int maxCnt = 0;
        for (int i = 0; i < mode.length; i++) {
            if (maxCnt < mode[i]) {
                maxCnt = mode[i];
                max = i;
            }
        }
        System.out.println("max = " + max);
    }

}

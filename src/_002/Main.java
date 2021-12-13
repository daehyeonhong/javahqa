package _002;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(1);
        while (true) {
            Integer left;
            Integer right;
            left = sequence.get(sequence.size() - 2);
            right = sequence.get(sequence.size() - 1);
            sequence.add(left + right);
            if (sequence.size() > 15)
                break;
        }
        for (Integer integer : sequence)
            System.out.println("integer = " + integer);

        Integer doublePrevNumber = 1;
        Integer prevNumber = 1;

        for (Integer i = 3; i <= 15; i++) {
            Integer nNumber = doublePrevNumber + prevNumber;
            System.out.println("nNumber = " + nNumber);
            doublePrevNumber = prevNumber;
            prevNumber = nNumber;
        }
    }

}

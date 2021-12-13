package _001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        students.add(new Student("김개똥", 1));
        students.add(new Student("김소똥", 2));
        students.add(new Student("김말똥", 3));
        while (true) {
            System.out.println("검색하고 싶다면 y, 종료하고 싶으면 n.");
            String yesNo = scanner.next();
            if (yesNo.equals("y")) {
                System.out.println("검색을 시작합니다.");
                String name = scanner.next();
                boolean flag = false;
                for (Student student : students)
                    if (student.getName().equals(name)) {
                        System.out.println("해당하는 학생의 학번은 : " + student.getNo());
                        flag = true;
                    }
                if (!flag) System.out.println("해당 학생은 존재하지 않습니다.");
            } else if (yesNo.equals("n"))
                break;
        }
        System.out.println("종료되었습니다.");
    }

}

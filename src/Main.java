import model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int inputNumber;
        while (true){
            MainFunction.printMenu();
            inputNumber = sc.nextInt();
            switch (inputNumber){
                case 1: {
                    students.add(MainFunction.inputStudent());
                    break;
                }
                case 2: {
                    MainFunction.sortList(students);
                    for (int i = 0; i < students.size(); i++){
                        System.out.println(students.get(i).toString());
                    }
                    break;
                }
                case 3: System.exit(0);
            }
        }
    }
}
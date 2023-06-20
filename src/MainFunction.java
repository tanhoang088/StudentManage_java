import model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainFunction{
    public static Student inputStudent(){
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID: ");
        student.setID(sc.nextInt());
        sc.nextLine();
        System.out.println("Input full name: ");
        student.setFullName(sc.nextLine());
        System.out.println("Input address: ");
        student.setAddress(sc.nextLine());
        System.out.println("Input phone number: ");
        student.setPhoneNumber(sc.nextInt());
        return student;
    }
    public static void printMenu(){
        System.out.println("1. Input student");
        System.out.println("2. Export student list");
        System.out.println("3. Exit!");
    }
    public static void sortList(ArrayList<Student> list){
        list.sort((o1, o2)
                -> Integer.toString(o1.getID()).compareTo(Integer.toString(o2.getID())));

    }
}

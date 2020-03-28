/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.Scanner;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue<Student> myCircularQueue = new MyCircularQueue<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the detail of Student :");
            System.out.print("Enter name :");
            String name = scanner.nextLine();
            System.out.print("Enter roll Number :");
            int rollNumber = scanner.nextInt();
            System.out.print("Enter number of BackLogs :");
            int backLog = scanner.nextInt();
            Student st = new Student(rollNumber, name, backLog);
            myCircularQueue.enqueue(st);
        }
        System.out.println(myCircularQueue);
    }

}

package InterviewQuestions;
// How to take user Input ................

import java.util.Scanner;

public class Programme001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Hello  "+ name  + "  " +"and your age is " + age);
        scanner.close();
    }
}

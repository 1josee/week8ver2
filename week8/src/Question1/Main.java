package Question1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String name, adresses, fileName;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file:");
        fileName = scanner.nextLine();
        PrintWriter pw = new PrintWriter(new FileWriter(fileName,true));

        System.out.println("Enter Name: ");
        name = scanner.nextLine();

        System.out.println("Enter adresses: ");
        adresses = scanner.nextLine();

        System.out.println("Enter age: ");
        age = scanner.nextInt();
        pw.println(name+ "," + adresses + "," + age);
        pw.flush();
        pw.close();
    }
}


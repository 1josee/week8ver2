package Question2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner fileScanner = new Scanner(new File("scr/users.txt"));

        While(fileScanner.hasNext()){
            System.out.println();
        }
    }
}

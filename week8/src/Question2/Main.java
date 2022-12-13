package Question2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        String name, adresses, age;
        ing age;
        Scanner fileScanner = new Scanner(new File("/week8/users.txt"));
        while (fileScanner.hasNext()){
            line = fileScanner.nextLine();
            StringTokenizer inReader = new StringTokenizer(line,",");
            if(inReader.countTokens() != 3){
                throw new IOException("invalid input");
            } else {
                name = inReader.nextToken;
                adresses =inReader.nextToken;
                age = Interger.parseInt(inReader.nextToken());
            }
            System.out.println(name +","+ adresses +","+ age);
        }
    }
}

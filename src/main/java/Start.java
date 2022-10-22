import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws FileNotFoundException {
        Automat auto = new Automat("123", "Ben Ag");
        auto.input("data.csv");
        System.out.println(auto.print(3));
    }
}

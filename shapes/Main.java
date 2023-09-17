import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Circle c1 = new Circle(2.0, 1.0, 1.0);
        c1.PrintMessage();
        c1.GetPerimeter();
        c1.GetArea();
        c1.SetRadius(1.0);

        double radiusWhatEver = c1.GetRadius();

        System.out.println("\n");

        Rectangle r1 = new Rectangle(1.0, 1.0);
        r1.PrintMessage();
        r1.GetPerimeter();
        r1.GetArea();
    }
}

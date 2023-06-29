// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Select an action to be performed in the Animal class:");
        System.out.println("1. Insert new animal giving name, code, kind, weight and max age");
        System.out.println("2. Print current status of the animal list");
        System.out.println("3. Search animal via name");
        System.out.println("4. Search animal via code");
        System.out.println("5. Delete animal from list via code");
        System.out.println("6. Feed animals");
        System.out.println("7. Save list of animals and exit program");

        Animal.animalList = new ArrayList<Animal>();

        String code;
        String name;
        String kind;
        int weight;
        int maxAge;

        boolean flag = true;

        while (flag) {
            System.out.println("Select an option from 1 to 6 from the table above.");

            Scanner scanner1 = new Scanner(System.in);
            int option = scanner1.nextInt();

            switch (option) {
                case 1: // Insert new animal in the list
                    System.out.println("Insert data of the new animal");

                    Scanner scanner2 = new Scanner(System.in);
                    code   = scanner2.nextLine();
                    name   = scanner2.nextLine();
                    kind   = scanner2.nextLine();
                    weight = scanner2.nextInt();
                    maxAge = scanner2.nextInt();

                    System.out.println("Animal added successfully");

                    if (kind.equals("Mammal")) {
                        Animal.animalList.add(new Mammal(code, name, kind, weight, maxAge));
                    } else if (kind.equals("Rodent")) {
                        Animal.animalList.add(new Rodent(code, name, kind, weight, maxAge));
                    } else if (kind.equals("Reptilian")) {
                        Animal.animalList.add(new Reptilian(code, name, kind, weight, maxAge));
                    }

                    break;
                case 2: // Print current list status
                    System.out.println("Printing list of animals");
                    System.out.println("Current number of animals: " + Animal.animalList.size());
                    Animal.PrintAnimals();
                    break;
                case 3: // Search animal via name
                    System.out.println("Give name of animal to be found:");
                    Scanner scanner3 = new Scanner(System.in);
                    name = scanner3.nextLine();
                    Animal.FindAnimalViaName(name);
                    break;
                case 4: // Search animal via code
                    System.out.println("Give code of animal to be found:");
                    Scanner scanner4 = new Scanner(System.in);
                    code = scanner4.nextLine();
                    Animal.FindAnimalViaCode(code);
                    break;
                case 5: // Delete animal
                    System.out.print("Insert code of animal to be deleted:");
                    Scanner scanner5 = new Scanner(System.in);
                    code = scanner5.nextLine();
                    Animal.DeleteAnimalWithCode(code);
                    System.out.println("New number of animals: " + Animal.animalList.size());
                    Animal.PrintAnimals();
                    break;
                case 6: // Feed animals
                    System.out.println("Feeding animals..");
                    for (Animal animal : Animal.animalList) {
                        animal.Eat();
                    }
                    break;
                case 7: // Save and exit
                    System.out.println("Saving animals to file..");

                    try {
                        FileWriter logFile = new FileWriter("animals.txt");

                        logFile.write("The animals of the zoo are listed below: \n");
                        logFile.write("code   name   kind\n");

                        for (Animal animal : Animal.animalList) {
                            logFile.write(animal.m_code + "  " + animal.m_name + "  " + animal.m_kind + "\n");
                        }

                        logFile.close();
                        System.out.println("Successfully saved animal data to file..");
                    } catch (IOException ex) {
                        System.out.println("ERROR OCCURED DURING WRITING TO FILE PROCESS");
                        ex.printStackTrace();
                    }

                    System.out.println("Terminating program execution..");
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong input: try again!");
            }
        }
    }
}
import java.util.ArrayList;

public class Animal {
  static public ArrayList<Animal> animalList;

  String m_code;
  String m_name;
  String m_kind;
  int m_weight;
  int m_maxAge;

  Animal(String code, String name, String kind, int weight, int maxAge) {
    this.m_code   = code;
    this.m_name   = name;
    this.m_kind   = kind;
    this.m_weight = weight;
    this.m_maxAge = maxAge;
  }

  public static void PrintAnimals() {
    int ii = 0;

    for (Animal animal : animalList) {
      ii++;
      System.out.println(ii + "." + " name: " + animal.m_name + ", code: " + animal.m_code);
    }
  }

  public static void FindAnimalViaName(String name) {
    for (Animal animal : animalList) {
      if (animal.m_name.equals(name)) {
        System.out.println("Found animal with name: " + name);
        System.out.println("The code of the animal is: " + animal.m_code);
      }
    }
  }

  public static void FindAnimalViaCode(String code) {
    for (Animal animal : animalList) {
      if (animal.m_code.equals(code)) {
        System.out.println("Found animal with code: " + code);
        System.out.println("The name of the animal is: " + animal.m_name);
      }
    }
  }

  public static void DeleteAnimalWithCode(String code) {
    int jj = -1;

    for (int ii = 0; ii<animalList.size(); ++ii) {
      if (animalList.get(ii).m_code.equals(code)) {
        jj = ii; // This is the index of the animal that will be deleted later
      }
    }

    animalList.remove(jj);

    System.out.println("The new array of animals after the deletion process is as follows:");

    for (Animal animal : animalList) {
        System.out.println("name: " + animal.m_name + "  code: " + animal.m_code);
    }
  }

  public void Eat () {
    System.out.println("I am an unclassified animal and I am going to eat.");
  }
}

public abstract class Shape {
    // Parent variables, which are transferred to the children classes (Circle and Rectangle)
    public double perimeter_;

    public double area_;

    // Declaration of a static final variable to be used for calculations in the children classes
    public static final double PI = 3.14;

    // Constructor of the Parent class
    public Shape() {
        System.out.println("Created a new Shape");
    }

    // Non-abstract methods (MAY or MAYNOT be overriden in the children classes)
    public void PrintMessage() {
        System.out.println("I am a Shape");
    }

    // Abstract methods (MUST be overriden in the children classes)
    public abstract void GetArea();

    public abstract void GetPerimeter();

    // Final methods (MUST NOT be overriden in the children classes)
    public final void PrintHello() {
        System.out.println("Hello");
    }
}

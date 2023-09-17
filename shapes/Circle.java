public class Circle extends Shape {
    // Child variables
    private double r_;
    private double x_;
    private double y_;

    // Constructor
    public Circle(double r, double x, double y) {
        super(); // Calls the constructor of the parent class (Shape)

        r_ = r;
        x_ = x;
        y_ = y;
    }

    // Methods of parent class (Shape) to be overriden
    @Override
    public void PrintMessage() {
        System.out.println("I am a circle");
    }

    @Override
    public void GetPerimeter() {
        perimeter_ = 2.0 * PI * r_;

        System.out.println("Perimeter equal to: " + perimeter_);
    }

    @Override
    public void GetArea() {
       area_ = 4.0 * PI * r_ * r_;

       System.out.println("Area equal to: " + area_);
    }

    // Setters
    public void SetRadius(double r) {
        r_ = r; // equivalent to this.r_ = r
    }

    public void SetXcoord(double x) {
        x_ = x;
    }

    public void SetYcoord(double y) {
        y_ = y;
    }

    // Getters
    public double GetRadius() {
        return r_;
    }

    public double GetXcoord() {
        return x_;
    }

    public double GetYcoord() {
        return y_;
    }
}

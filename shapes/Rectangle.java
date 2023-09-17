public class Rectangle extends Shape {
    // Child variables
    private double width_;

    private double height_;


    // Constructor
    public Rectangle(double width, double height) {
        super();  // Calls the constructor of the parent class (Shape)

        width_  = width;
        height_ = height;
    }

    // Methods of parent class (Shape) to be overriden
    @Override
    public void GetPerimeter(){
        perimeter_ = 2.0 * width_ + 2.0 * height_  ;

        System.out.println("Perimeter equal to: " + perimeter_);
    }

    @Override
    public void GetArea() {
        area_ = width_ * height_;

        System.out.println("Area equal to: " + area_);
    }

    // Setters
    public void SetPlatos(double width) {
        width_ = width;
    }

    public void SetXcoord(double height) {
        height_ = height;
    }

    // Getters
    public double GetPlatos() {
        return width_;
    }

    public double GetYpsos() {
        return height_;
    }
}

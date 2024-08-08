//3. Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
// Shape class
class Shape {
    protected int length;
    protected int breadth;

    // Constructor to initialize length and breadth
    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area
    public int getArea() {
        return length * breadth;
    }
}
// Rectangle class, subclass of Shape
class Rectangle extends Shape {

    // Constructor to initialize length and breadth via super()
    public Rectangle(int length, int breadth) {
        super(length, breadth); // Call to superclass constructor to initialize length and breadth
    }

    // Override getArea() method to calculate area of rectangle
    @Override
    public int getArea() {
        return length * breadth; // Calculation of area specific to rectangle
    }
}
// Main class to test Shape and Rectangle classes
public class OopFif {

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(6, 5);
        System.out.println("The Area of Rectangle is " + rc.getArea());
    }
}

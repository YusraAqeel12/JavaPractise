//Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.

abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape{
    private double Radius ;

    public Circle(int Radius){
        this.Radius=Radius ;
    }

    public double calculateArea(){
        return Math.PI * Radius * Radius ;
    }

    public double calculatePerimeter(){
        return 2 * Math.PI * Radius ;
    }
}
class Triangle extends Shape{
    private double sideOne ;
    private double sidetwo ;
    private double sidethree ;

    public Triangle(int sideOne , int sidetwo , int sidethree){
        this.sideOne = sideOne ;
        this.sidetwo = sidetwo ;
        this.sidethree = sidethree ;

    }

    public double calculateArea(){
        return  sideOne + sidetwo + sidethree / 2 ;
    }

    public double calculatePerimeter(){
        return sideOne+ sidetwo + sidethree ;
    }


}

public class OopsEleven {
    public static void main(String[] args) {
        Triangle t = new Triangle(0, 0, 0) ;
        t.calculateArea() ;
        
    }
}

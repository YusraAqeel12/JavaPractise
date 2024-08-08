//Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.
import java.math.*;
interface Shape{
    double getArea() ;
}
class Rectangle implements Shape{
    private double l ;
    private double b ;
    
    public Rectangle(double l , double b){
        this.l = l;
        this.b = b ;
    }

    public double getArea(){
        return l * b ;

    }
}

class Circle implements Shape{
    private double radius ;

    public Circle(double radius){
        this.radius = radius ;

    }

    public double getArea(){
        return Math.PI*radius*radius ;
    }

}

class Square implements Shape{
    private double side ;

    public Square(double side){
        this.side = side ;

    }

    public double getArea(){
        return side *side ;
    }
}

public class OopsThirteen {

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(6,7) ;
        Circle c = new Circle(8) ;
        Square s = new Square(6) ;
        System.out.println(s.getArea());
        System.out.println(c.getArea());
        System.out.println(rc.getArea());
        
    }
}
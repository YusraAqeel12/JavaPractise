//Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.
import java.lang.Math;
class Circle{
    private int radius ;

    public int getRadius(){
        return radius ;
    }

    public void setRadius(int radius){
        this.radius = radius ;
    }

    public double getArea(){
        return Math.PI*radius*radius ; 
    }



}


public class OopsSixteen {
    public static void main(String[] args) {
        Circle c = new Circle() ;
        c.setRadius(5);
        c.getRadius() ;
       
        System.out.println(c.getArea());
        
    }

}

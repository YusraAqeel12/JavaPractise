//. Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

class Square{
    int side ;
    
    public int area(){
        return side * side ;

    }

    public int perimeter(){
        return 4 * side ;
    }
}


public class OopsThird {
    public static void main(String[] args) {
        Square sq = new Square() ;
        sq.side = 5 ;
        sq.area() ; 
        sq.perimeter() ;
        System.out.println( sq.area() ) ;
        System.out.println(sq.perimeter());
    }
}

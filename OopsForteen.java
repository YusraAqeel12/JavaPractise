//Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods

//inetrface Resizable hai jismai do methods hain 
interface Resizable{
    public void ResizableWidth(int width) ;

    public void ResizableHeight(int Height) ;
}
class Rectangle implements Resizable{
//Declare instance variable  that stores width and height
   private  int width ;
   private int Height ;

//Constrctor for initializing instance variables
    public Rectangle(int width , int Height){
        this.width = width ;
        this.Height = Height ;
    }

//method to change with of rectangle to a new value . Method takes a parameter and takes new width that you want your rectangle to have
//this.width is the width of the current rectangle object
//By assigning width to this.width, you are updating the width of the rectangle to the new value provided in the width parameter.
    public void ResizableWidth(int width){
        this.width = width ;
    }

    public void ResizableHeight(int Height){
        this.Height = Height ;
    }

    public void Total(){
        System.out.println(width + " " + Height );

    }
}
public class OopsForteen {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle(6, 9);
        rc.ResizableWidth(7);
        rc.ResizableHeight(8);
        rc.Total( );
    }
}

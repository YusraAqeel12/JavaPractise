
// Class
class Students{
// Instance Attributes --Attributes specific to the object of class
    String Name ;
    int Roll_Number ;
// Class Attributes -- declared with final keyword // Constant Variable
// Shared among all objects of the class
    static final  String Address = "Karachi" ;

// Instance Method
    public void MyMethod(){
        System.out.println("This is Class Method");

    }
}

public class Oops {
    
    public static void main(String[] args) {
        // Two Objects 
        Students stdOne = new Students();
        Students stdTwo = new Students() ;
        System.out.println(Students.Address);        
        System.out.println(stdOne.Address);
       


        stdOne.Name = "Rahul" ;
        System.out.println(stdOne.Name);
        stdOne.Name = "Ramon" ;
        System.out.println(stdOne.Name);
        stdOne.MyMethod();
        
    
        
    }
}

// Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.
class Person{
    String FirstName ;
    String LastName ;
    public char[] getName;
    public char[] getAge;
    public char[] getCountry;

    public Person(String FirstName , String LastName){
        this.FirstName = FirstName ;
        this.LastName = LastName ;

    }

    public Person() {
        //TODO Auto-generated constructor stub
    }

    public String getFirstName(){
        return FirstName ;
    }

    public String getLastName(){
        return LastName ;
    }

    public void setName(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }

    public void setAge(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAge'");
    }

    public void setAge(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAge'");
    }

    public void setcountry(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setcountry'");
    }
}
class Employee extends Person{
    String Employeetitle ;
    int EmployeeID ;

    public Employee(String FirstName , String LastName , String Employeetitle , int EmployeeID){
        super(FirstName , LastName) ;
        this.Employeetitle = Employeetitle ;
        this.EmployeeID = EmployeeID ;


    }
    public int getEmployeeID(){
        return EmployeeID ;
    }

    public String getLastName(){
        return Employeetitle + " " + super.getLastName();
    }

}

public class OopsNine {
    
    public static void main(String[] args) {
        Person pc = new Person("Yusra", "Aqeel") ;
        Employee em = new Employee("Yusra", "Aqeel", "Manager", 9) ;
        System.out.println(em.getLastName() );
        System.out.println(em.getEmployeeID() );
        System.out.println(pc.FirstName);
        System.out.println(pc.LastName );


    }
}
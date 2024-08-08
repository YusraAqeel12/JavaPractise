//Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.

class Person {
    String FirstName;
    String LastName;

    public Person(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }
}

class Employee extends Person {
    String jobTitle;
    int EmployeeID;

    public Employee(String jobTitle, String FirstName, String LastName, int EmployeeID) {
        super(FirstName, LastName);
        this.jobTitle = jobTitle;
        this.EmployeeID = EmployeeID;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}

public class OopsEight {
    public static void main(String[] args) {
        Person pc = new Person("Yusra", "Aqeel");
        Employee em = new Employee("Engineer", "Yusra", "Aqeel", 0); // Correct order of parameters
        System.out.println(em.getEmployeeID() );
        System.out.println(em.getLastName() ) ;

    }
}


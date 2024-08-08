//Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
class Employee{
    int Salary ;

    public Employee(int Salary){
        this.Salary = Salary ;
    }

    public void Work(){
        System.out.println("Work Method");
    }

    public int SalaryDef(){
        return Salary ;
    }
}

class Manager extends Employee{

// constructor jo super class ka constructor call karta hai 
    public Manager(int Salary){
        super(Salary) ;

    }

    public void Work(){
        System.out.println("Work");
    }

    public void AddEmployee(){
        System.out.println("Employee Add");
    }
    
}
public class OopsSixth {

    public static void main(String[] args) {
        Employee em = new Employee(700000) ;
        Manager mg = new Manager(500000) ;
        System.out.println(em.SalaryDef());
        mg.Work();
        mg.AddEmployee();
        em.Work();
    }
}
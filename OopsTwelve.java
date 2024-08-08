//Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.

abstract class Employee{
    String name ;
    double BaseSalary ;
    
    public Employee(String name , double baseSalary2){
        this.name = name ;
        this.BaseSalary = baseSalary2 ;
    }
    abstract double calculateSalary();
    abstract void displayInfo();
}
 class Manager extends Employee{
    private double bonus ;

    public Manager(String name , int BaseSalary ,double bonus){
        super(name, BaseSalary) ;
        this.bonus = bonus ;
    }

    public double calculateSalary(){
        return BaseSalary + bonus ;
    }
    public void  displayInfo(){
        System.out.println(name);
        System.out.println(calculateSalary());
    }

 }
//Programmer.java
class Programmer extends Employee {
    private int overtimeHours;
    private double hourlyRate;
  
    public Programmer(String name, double BaseSalary, int overtimeHours, double hourlyRate) {
      super(name, BaseSalary);
      this.overtimeHours = overtimeHours;
      this.hourlyRate = hourlyRate;
    }
  
    @Override
    public double calculateSalary() {
      return BaseSalary + (overtimeHours * hourlyRate);
    }
  
    @Override
    public void displayInfo() {
      System.out.println("Programmer Name: " + name);
      System.out.println("Base Salary: $" + BaseSalary);
      System.out.println("Overtime Hours: " + overtimeHours);
      System.out.println("Hourly Rate: $" + hourlyRate);
      System.out.println("Total Salary: $" + calculateSalary());
    }
  }
  
public class OopsTwelve {
    public static void main(String[] args) {
        
    }
}

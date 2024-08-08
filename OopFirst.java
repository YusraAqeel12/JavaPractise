//Create a class Employee with the following properties and methods: Salary (property) (int) getSalary (method returning int) name (property) (String)
// getName (method returning String) setName (method changing name)

class Person{
//Instance variables private since we are acheiving encapsulation we cannot directly access them through objects

    private String name ;
    private int age ;

//Using GetMethod to access the instance variables -- Yeh object kai internal state ka access
//daitay liken inki modification ka access nahi daitay iisay obj ki state maintain rehti hai
    public String GetName(){
        return name ;

    }
    public int getAge(){
        return age ;
    }

//Using SetMethods to set/modify/update the values on instance variables 
//yeh controlled tareekay sai instance var ko change karnay daitay hain
//Setter method sai developer validation rules or logic inforce karatay hain jissay data 
//consistency maintain rehti hain and invalis states prevent hoti hai
    public void setName(String  NewName){
        name = NewName ;

    }

    public void setAge(int NewAge){
        age = NewAge;
    }
}

public class OopFirst {

    public static void main(String[] args) {
        Person pc = new Person() ;
//Obj kai method ko call karkai usmai data pass kiya hai
        pc.setName("Yusra");
        pc.setAge(9);
        System.out.println(pc.getAge() + pc.GetName());

        pc.setName("Ali");
        System.out.println(pc.GetName());
    
        
    }
}
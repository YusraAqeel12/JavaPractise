class Persoon{
    private String name ;
    private int age ;
    private String country ;

//utilizes setter methods (setName, setAge, setCountry) to set values for the instance variables after the object is created. This approach allows for flexibility in setting values incrementally or conditionally after the object is instantiated.

    public void setName(String name ){
        this.name = name ;
    }

    public void setAge(int age ){
        this.age = age  ;
    }

    public void setcountry(String country ){
        this.country = country ;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCountry(){
        return country;
    }

}


public class OopsFifteen {
    public static void main(String[] args) {
        Person pc = new Person() ;
        pc.setName("Yusra") ;
        pc.setAge(0) ;
        pc.setcountry("Pakistan") ;
        System.out.println(pc.getName);
        System.out.println(pc.getAge);
        System.out.println(pc.getCountry);

        
    }
}
//if no constructors are defined explicitly within a class, Java provides a default constructor automatically. The Person class in the provided code implicitly has a default constructor because no other constructors are defined. This default constructor initializes the instance variables (name, age, country) with default values (null for String and 0 for int).
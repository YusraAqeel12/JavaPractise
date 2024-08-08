//Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

class Animal{
    public void MakeSound(){
        System.out.println("Animal Makes Sound");
    }
}

class Cat extends Animal{
    public void MakeSound(){
        System.out.println("Cats Barks");
    }
}

public class OopForth {
    public static void main(String[] args) {
        Cat ct = new Cat() ;
        Animal an = new Animal() ;
        an.MakeSound();
        ct.MakeSound();
       
        
    }
}

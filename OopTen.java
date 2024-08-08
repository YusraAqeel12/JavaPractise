//Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal

abstract class Animal{
    abstract void Sound();
}

class Lion extends Animal{
    public void Sound(){
        System.out.println("Lion roars");
    }
}
class Tiger extends Animal{
    public void Sound(){
        System.out.println("Tiger Growls");
    }
}

public class OopTen {
    public static void main(String[] args) {
        Lion l = new Lion() ;
        Tiger t = new Tiger() ;
        l.Sound();
        t.Sound();
        
    }
}
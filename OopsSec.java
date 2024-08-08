//Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.


class cellphone{
    public void Ring(){
        System.out.println("Ringing");  
    }

    public void vibrate(){
        System.out.println("Vibrating");
    }

}

public class OopsSec {

    public static void main(String[] args) {
        cellphone cp = new cellphone() ;
        //Calling Methods of object 
        cp.Ring();
        cp.vibrate();
        
    }
}
public class LinkedList {

    //Class Of Node
    public static class Node {
        int  data ; // value of node
        Node next ; //address of the next node     

        //Constrctor of the class Node
        Node(int data ){
            this.data=data ;
        }
    }
    //Display LL
    //Jab tak temp point nahi karta null ko us waqt tak data print karo
    //agar temp point null iska matlab hamara LL kai list khatam hoga
    //temp point karay gaa panay next member ko 
    public static void Display(Node head ){
        Node temp = head ;
        while (temp!=null) {
        System.out.print(temp.data+" ");
        temp=temp.next ;
        }
    }

    //Length of LL
    //a node pass howa hai as head agar head null nahi hai toh count ko increase karo and doosray list ko point karo
    public static int Length(Node head){
        int count = 0 ;
        while (head !=null ) {
            count++;
            head.next=head;
        }
        return count;

    }
    public static void main(String[] args) {        
        Node a = new Node(7) ;
        Node b = new Node(6) ;
        Node c = new Node(5) ;
        a.next=b;
        b.next=c;
        Display(a);
        Length(a);

    }
}

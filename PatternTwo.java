//Hollow Rectangle
public class PatternTwo {

    public static void main(String[] args) {
        for (int i = 1 ;i <= 5 ; i++){
            for(int j = 1 ; j <=4 ;j++){
//Since hamay hollow rectangle print karna hai toh agar ij (1,1) and (5,4) per ho tab he stars print honay cahiaye
//First RC and Last Rc mai stars print karo
                if( i == 1 || j == 1 || i == 5 || j == 4){
                    System.out.print('*');
                }
//aur baaki sab indexes per aik gap print ho
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
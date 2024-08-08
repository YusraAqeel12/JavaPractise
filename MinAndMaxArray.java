public class MinAndMaxArray {
    public static void main(String[] args) {
        int Array[]={0,7,6,6,8,5,9};
        int Min = Array[0];
        for (int i = 1 ; i < Array.length ;i ++ ){
            if (Array[i] < Min ) {
                Min = Array[i];        
          
            }
        }  
        System.out.println(Min);
    }
}

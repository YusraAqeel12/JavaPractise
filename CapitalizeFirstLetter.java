public class CapitalizeFirstLetter {

    public static void main(String[] args) {
        String a = "yusraaqeel is the besr";
        String words[] = a.split("\\s+");
        String result = "";
        
        for (String i : words) {
            result = result + i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() +" ";
        }
        
        // Trim the trailing space
        
        System.out.println(result);
    }
}
//i.substring(0, 1).toUpperCase() extracts the first character of the word i and converts it to uppercase.
//i.substring(1).toLowerCase() extracts the rest of the word starting from the second character and converts it to lowercase.
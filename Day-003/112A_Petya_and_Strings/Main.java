import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    
    public static void main (String[] args){
        String string1= scan.next().toLowerCase();
        String string2 = scan.next().toLowerCase();
        
        if(string1.compareTo(string2) == 0) {
            System.out.println(0);
            
        }else if (string1.compareTo(string2)>0){
            System.out.println(1);
        }else{
            System.out.println(-1);
        }
    }
}
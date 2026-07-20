import java.util.*;
public class patterm {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
         System.out.println("Enter The ending number: ");
         int b = sc.nextInt();
        for(int i = 4; i<=b;i++)
        {
            for(int j =4; j>=b; j++)
            {
            System.out.print(j +"");
            } System.out.println("");
        }
       
     }
}

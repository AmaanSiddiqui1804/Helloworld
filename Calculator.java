import java.util.*;
public class Calculator{
   public static void main(String [] args){ 
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter first number: ");
   int a = sc.nextInt();
   System.out.println();
   System.out.print("Enter second number: "); 
   int b = sc.nextInt();
   System.out.println("Enter name of Operation:" );
   System.out.println("add || subtract ");
   String op = sc.next();
   
   int sum, dif ;

   if ("add".equalsIgnoreCase(op)) {
      
         sum = a+b;
         System.out.println("Addition of the given numbers is: " + sum);
   }

   else if ("subtract".equalsIgnoreCase(op)) {
      
         dif = a-b;
         System.out.println("Difference of the given numbers is: " + dif);
   }
   
   
   else{
        System.out.println("Error! Try again");
   }

   }
}
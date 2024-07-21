import java.util.Scanner;
public class Class_Quiz {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int Marks;
    
    
    Marks = scanner.nextInt();
    
   if (Marks >=80) {
    System.out.println("Marks:Pass(Level 7)");
   } else if (Marks >= 70) {
    System.out.println("Marks:Pass(Level 6)");
   } else if (Marks >=60) {
    System.out.print("Marks:Pass(Level 5)");
   }else if (Marks >= 50) {
    System.out.print("Marks:Pass(Level 4)");
   } else if (Marks >= 40) {
    System.out.print("Marks:Pass(Level 3)");
   } else if (Marks >=30) {
    System.out.print("Marks:Pass(Level 2)");
   } else if (Marks >=29) {
    System.out.print("Marks:Fail(Level 1)");
   }else{
    System.out.print("Please Enter Marks from 0-100");
   }
}
    
}
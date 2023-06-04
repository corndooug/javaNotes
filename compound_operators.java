import java.util.Scanner;
public class compound_operators {
  public static void main(String[] args) {
  Scanner gpa = new Scanner(System.in);

  //compound operators in action

   int totalGrade, fin, sub;
   System.out.print("Enter your grade in GEEC 111: ");
   totalGrade = gpa.nextInt();
   System.out.print("Enter your grade in GEEC 113: ");
   totalGrade += gpa.nextInt();
   System.out.print("Enter your grade in ISCC 101: ");
   totalGrade += gpa.nextInt();
   System.out.print("Enter your grade in ISPC 1O1: ");
   totalGrade += gpa.nextInt();

   System.out.println("How many subjects do you have?");
   sub = gpa.nextInt();

   fin = (totalGrade/sub);
   System.out.println("Your GPA is "+fin);



  }
}

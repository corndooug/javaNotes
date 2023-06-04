import java.util.Scanner;
public class grades {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("===============GRADING SYSTEM===============");
    System.out.println("PERCENTAGE EQUIVALENT   |    NUMERICAL RATING\n"
      +"       98 - 100         |         1.00\n"
      +"       95 - 97          |         1.25\n"
      +"       92 - 94          |         1.50\n"
      +"       89 - 91          |         1.75\n"
      +"       86 - 88          |         2.00\n"
      +"       83 - 85          |         2.25\n"
      +"       80 - 82          |         2.50\n"
      +"       77 - 79          |         2.75\n"
      +"       75 - 76          |         3.00\n"
      +"       FAILURE          |         5.00\n"
      +"=============================================");

    System.out.print("ENTER GRADE:      ");
    double inp_grade = input.nextDouble();
    System.out.print("FINAL GRADE:      "+inp_grade+"\n");
    
    /*the next line initiates the variable res as a null string to use it as a container*/
    String res = "NUMERICAL RATING: "; 
    if (inp_grade >= 98){
      System.out.print("       "+"1.00\n");}

    else if (inp_grade >= 95) {
      System.out.print(res+"1.25\n"); } 

    else if (inp_grade >= 92) {
      System.out.print(res+"1.50\n"); } 

    else if (inp_grade >= 89) {
      System.out.print(res+"1.75\n"); } 

    else if (inp_grade >= 86) {
      System.out.print(res+"2.00\n"); } 

    else if (inp_grade >= 83) {
      System.out.print(res+"2.25\n"); } 

    else if (inp_grade >= 80) {
      System.out.print(res+"2.50\n"); } 

    else if (inp_grade >= 77) {
      System.out.print(res+"2.75\n"); } 

    else if (inp_grade < 75) {
      System.out.print(res+"3.00\n");
    }

    if (inp_grade >= 75) {
      System.out.println("REMARKS:      PASSED"); 
    }
    else {
      System.out.println("REMARKS:      FAILED");
    }
 
  }
}

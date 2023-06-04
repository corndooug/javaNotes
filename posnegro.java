import java.util.Scanner;
public class posnegro {
  public static void main(String[] args) {
  Scanner inp = new Scanner(System.in);
  
  int inp_num;
  System.out.print("Input Number: ");
  inp_num = inp.nextInt();

  if (inp_num>0) 
    System.out.println(inp_num+" is positive.");
    else if(inp_num<0) 
    System.out.println(inp_num+" is negative.");
    else 
    System.out.println("Input is zero.");

  }
}


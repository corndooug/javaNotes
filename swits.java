import java.util.Scanner;
public class swits{
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
				
		System.out.print("Enter Campus:			");
		String campus = scan.next();
		System.out.print("Enter Student Number:		");
		String snum = scan.next();
		System.out.print("Enter Year of Enrollment:	20");
		int  yrEn= scan.nextInt();
		System.out.print("Enter Semester:			");
		String sem = scan.next();	
		
		  String campEqu = "";
		  switch(campus) {
		  
		    case "NLUC":
          campEqu = "1";
          break;
		    case "MLUC": 
          campEqu = "2";
          break;
		    case "SLUC": 
          campEqu = "3";
          break;
		    case "OUS": 
          campEqu  = "4";
          break;
		  }
		
		  String semEq = "";
		  switch(sem) {
		  
		    case "FIRST": 
          semEq  = "1";
          break;
		    case "SECOND":
          semEq = "2";
          break;
		    case "THIRD": 
          semEq = "3";
          break;
		  }
		
		System.out.println("ID NUMBER: "+yrEn+semEq+"-"+snum+"-"+campEqu);
  }
}

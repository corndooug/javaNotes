import java.text.DecimalFormat;
import java.util.Scanner;
public class bankshit {
    public static void main(String[] args) {
        DecimalFormat deciForm = new DecimalFormat("#,###.00");
        Scanner scan = new Scanner(System.in);

        // --- Acquiring scanuts --- 
        System.out.print("\nInitial Deposit: ");
        double init_dep = scan.nextDouble();

        System.out.print("Rate of interest: ");
        double i_rate = scan.nextDouble();
        double rate = (i_rate/100);

        System.out.print("Target Deposit: ");
        double tar_dep = scan.nextDouble();

        int years =1;
        double total_interest = 0;
        while (true) {
           if (init_dep>=tar_dep || i_rate < 1) {
            System.err.println("Syntax Error!");
            break;
           }

            else {
                System.out.println("\nYEAR        DEPOSIT       INTEREST\n");
                while (init_dep<tar_dep) {
                    double interest = init_dep * rate;
                    System.out.println("  "+years + "         " + deciForm.format(init_dep) + "         "+deciForm.format(interest));
                    init_dep += interest;
                    total_interest += interest;
                    years++;    
                }
                System.out.println("\nDeposit exceeds Php" + deciForm.format(tar_dep) + " at the end of year "+(years-1)+".");
            }
        }




    }
}

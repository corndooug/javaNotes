import java.text.DecimalFormat;
import java.util.Scanner;
public class lup{ 
  public static void main(String[] args) {
    Scanner inp = new Scanner (System.in);
    // Decimal formatting '#' symbol for void
    DecimalFormat decimalFormat = new DecimalFormat("#,###.00");

    // --- Acquiring inputs --- 
    System.out.print("\nInitial Deposit: ");
    double init_dep = inp.nextDouble();

    System.out.print("Rate of interest: ");
    double i_rate = inp.nextDouble();
    double rate = (i_rate/100);

    System.out.print("Target Deposit: ");
    double tar_dep = inp.nextDouble();

    // --- (2) To check if bobo yung nag-input
    // --- Java will only print the headers ng table kung vald yung input
        if (init_dep>=tar_dep || i_rate < 1) 
          System.err.println("\nINVALID ARGUMENT, BOBO! ");
        else {
          System.out.println("\nYEAR        DEPOSIT       INTEREST\n");
        }
        // --- The loop (nasa notes ko na yung explanation) ---
        int years = 1;              // initate a variable for the year
        double total_interest = 0;  // another for the final interest
        while (init_dep<tar_dep) {
            if (init_dep>=tar_dep || i_rate < 1) 
                break;
            double interest = init_dep * rate;
            System.out.println("  "+years + "         " + decimalFormat.format(init_dep) + "         "+decimalFormat.format(interest));
            init_dep += interest;
            total_interest += interest;
            years++;
        }

    // --- Another if to print out the final statement kung hindi bobo yung user
    if (years>1) 
              System.out.println("\nDeposit exceeds Php" + decimalFormat.format(tar_dep) + " at the end of year "+(years-1)+".");
  }
}

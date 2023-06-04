import java.text.DecimalFormat;

public class ActivityTwo {
    public static void main(String[] args) {
      final DecimalFormat deciform = new DecimalFormat ("0.00");
      final DecimalFormat deciform_ii= new DecimalFormat ("0.0");
      // print (deciform.format(value))

      int apple_q = 23;
      double apple_p = 22.50;
      int orng_q = 25;
      int orng_p = 18;
      int lmn_q = 13;
      double lmn_p = 32.5;
      double s_total = ((apple_q*apple_p)+(orng_q*orng_p)+(lmn_q*lmn_p));
      double tax = s_total*0.05;
      double total = (s_total + tax);

      System.out.println("====================================");
      System.out.println("           PRUTASAN NI GIO        ");
      System.out.println("====================================");
      System.out.println("ITEMS       Q        P       T  ");
      System.out.println("------------------------------------");
      System.out.println("Apple       "+apple_q+"    "+(deciform_ii.format(apple_p))+"    "+(deciform.format(apple_p*apple_q)));
      System.out.println("Orange      "+orng_q+"    "+(deciform_ii.format(orng_p))+"    "+(deciform.format(orng_p*orng_q)));
      System.out.println("Lemon       "+lmn_q+"    "+(deciform_ii.format(lmn_p))+"    "+(deciform.format(lmn_q*lmn_p)));
      System.out.println("------------------------------------");
      System.out.println("SUBTOTAL:                 "+(deciform.format(s_total)));
      System.out.println("SALES TAX:                "+(deciform.format(tax)));
      System.out.println("                                    ");
      System.out.println("TOTAL:                    "+(deciform.format(total)));
      System.out.println("====================================");

    }
}

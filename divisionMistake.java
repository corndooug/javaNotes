import java.util.Scanner;
public class divisionMistake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numerator, denominator, result;
        System.out.print("Enter numerator: ");
        numerator = sc.nextInt();
        System.out.print("Enter denominator: ");
        denominator = sc.nextInt();

        try {
            result = numerator/denominator;
            System.out.println(numerator+" / "+denominator+" = "+result);
        } catch (ArithmeticException mistake) {
            //TODO: handle exception
            System.out.println(mistake.getMessage());
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TipTaxCalculator calc = new TipTaxCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bill amount: ");
        double bill = sc.nextDouble();
        System.out.println("Enter tax rate: ");
        double taxRate = sc.nextDouble();
        System.out.println("Enter tip rate: ");
        double tipRate = sc.nextDouble();

        System.out.println("Bill amount: " + bill);

        System.out.println("Tax amount: " + calc.calculateTax(bill,taxRate));
        double taxAmt = calc.calculateTax(bill,taxRate);

        System.out.println("Tip amount: " + calc.calculateTip(bill,tipRate));
        double tipAmt = calc.calculateTip(bill,tipRate);

        System.out.println("Total amount: " + calc.totalBill(bill,taxAmt,tipAmt));
        double totalAmt = calc.totalBill(bill,taxAmt,tipAmt);

        System.out.println(("Total rounded:" + calc.roundTotal(totalAmt)));


    }
}
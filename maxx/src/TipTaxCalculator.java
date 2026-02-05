
import java.util.Scanner;


public class TipTaxCalculator {

    public double calculateTip(double bill, double tipRate) {


    return bill*(tipRate/100);

    }

    public double calculateTax(double amount, double taxRate){


    return amount * (taxRate/100);

    }

    public double totalBill(double bill, double taxAmt, double tip) {

        return (bill + taxAmt + tip);

    }

    public double roundTotal(double totalBill){

        return Math.round(totalBill);


    }






    }


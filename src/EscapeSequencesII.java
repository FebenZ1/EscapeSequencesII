import java.util.Scanner;

public class EscapeSequencesII {
    public static void main(String[] args){


        /*

        Write a Java program to print the following columns of values. Use \t for the tabs between the columns.
Cost      Quantity   Total
$1,000.00   4       $4,000.00
$   50.00   8         $400.00
______________________________
TOTAL:      12      $4,400.00


         */

        System.out.print("Cost");
        System.out.print("\t" + "  Quantity");
        System.out.println("\t" + "Total");
        System.out.println("$1,000.00" + "\t" + "4" + "\t" + "   $4,000.00");
        System.out.println("   $50.00" + "\t" + "8" + "\t" + "     $400.00");
        System.out.println("________________________________________");
        System.out.println("TOTAL:" + "\t" + "   12" + "\t" + "   $4,400.00");


    }

}

import java.text.DecimalFormat;  //importing the class from the package
import java.text.DecimalFormatSymbols;

import static java.lang.System.out;
//import java.text.*;

public class L7{

    public static void main(String[] args){

        //creates a decimal object roundTo2 and initializes it.
        DecimalFormat roundTo2 = new DecimalFormat("0.00");

        //creates a decimal object roundTo3 and initializes it.
        DecimalFormat roundTo3 = new DecimalFormat("0.000");

        //creates a double variable number and assigns it a decimal value
        double number = Math.sqrt(2);

        //METHOD 1: OUTPUT BY ASSIGNING TO ANOTHER VARIABLE

        //using the roundTo2 object to call the format method from the DecimalFormat class.
        String displayNumber = roundTo2.format(number);
        out.println("The number rounded to 2 decimals is " + displayNumber);

        //METHOD 2: OUTPUT BY CALLING THE METHOD IN THE PRINTLN COMMAND

        //using the roundTo2 object to call the format method from the DecimalFormat class.
        out.println("The number rounded to 3 decimals is " + roundTo3.format(number));

        DecimalFormat currency = new DecimalFormat ("$#,###.00");
        out.println("yoo have " + currency.format(number));
        out.println("you have " + currency.format (1234));

        DecimalFormat percentave = new DecimalFormat ("00%");
       // out.println(("Sales tax is" + percentage . format(number));
        //System.out.println("Sales tax is " + percentage . format(0.7));

        DecimalFormat crazy = new DecimalFormat("this is just lots of money $#,##.00");
        out.println(crazy.format(500*1.05));

    }
}

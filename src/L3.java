public class L3 {

    //add the main method header below.

    /*
   literal value is a value written directly into code
   an expression is a value written using variable or operators
     */
    public static void main(String[] args) {

        //int literalValue = 5;
        //int expression1=5+6;
        //int expression2 = literalValue +6;
        //int literaValue2 = 5;
        // String expression3 = literaValue2 + literalValue;

//Examples of literal values
//double literalExample=3.4;
//boolean literalExample2 = true;
//String literalExample3 = "apple";

//Example of expression
//boolean expressexample = 5>7;

//Bad example
//int badexample = 5.4 - 4 ;

//A string expression is called string concentation. you can
//combine string using the plus sign string
//expression3 = "A fruit people eat us an " + literalExample3;

        String message1 = " the store has 20 apples";
        String message2 = "apples in stock";
        int numApples = 20;
        System.out.println("the store has 20 apples in stock");
        System.out.println("the store has"+ numApples + "apples in stock");
        System.out.println( message1 + numApples+message2);
    }
}
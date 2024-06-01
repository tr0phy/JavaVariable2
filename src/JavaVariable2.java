public class JavaVariable2
{
    public static void main(String[] args)
    {
        int intOperandA = 10;
        int intOperandB = 5;
        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        double doubleOperandA = 5.50;
        double doubleOperandB = 4.50;
        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleDifference = 0;
        double doubleQuotient = 0;

        intSum = intOperandA + intOperandB; // Assignment that uses the arithmetic operator +
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum); // Output Statement
        intDifference = intOperandA - intOperandB; // Assignment that uses the arithmetic operator -
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference); // Output Statement
        intProduct = intOperandA * intOperandB; // Assignment that uses the arithmetic operator *
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct); // Output Statement
        intQuotient = intOperandA / intOperandB; // Assignment that uses the arithmetic operator /
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient); // Output Statement
        intModulo = intOperandA % intOperandB; // Assignment that uses the arithmetic operator %
        System.out.println("the remainder using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo); // Output Statement

        doubleSum = doubleOperandA + doubleOperandB; // Assignment that uses the arithmetic operator +
        System.out.println("The sum using values of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum); // Output Statement
        doubleDifference = doubleOperandA - doubleOperandB; // Assignment that uses the arithmetic operator -
        System.out.println("The difference using value of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference); // Output Statement
        doubleProduct = doubleOperandA * doubleOperandB; // Assignment that uses the arithmetic operator *
        System.out.println("The product using value of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct); // Output Statement
        doubleQuotient = doubleOperandA / doubleOperandB; // Assignment that uses the arithmetic operator /
        System.out.println("The quotient using value of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient); // Output Statement

        int kidsNumber = 1;
        System.out.println("The number of kids in my family is " + kidsNumber);
        boolean isRaining = false;
        System.out.println("Is it raining? "+ isRaining);
        double priceOfGas = 3.53;
        System.out.println("What is the price of a gallon of gas? " + priceOfGas);
        int favNumber = 22;
        System.out.println("What is your favorite number? " + favNumber);
        int shoeSize = 12;
        System.out.println("What is your shoe size? " + shoeSize);
        String birthMonth = "June";
        System.out.println("What is your birth month? " + birthMonth);
        String user = "Ted";
        String lastName = "Shonia";
        String fullName = user + " " + lastName;
        System.out.println("What is your full name? " + fullName);
    }
}
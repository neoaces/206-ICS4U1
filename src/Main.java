import java.util.Arrays;

public class Main {

    public static final int CM_NEEDED = 15; // Creates a class-wide constant, seen as Main.CM_NEEDED
    public static void main(String[] args) {
        //i.e...
        System.out.println("The classwide constant: " + Main.CM_NEEDED);
        /* For example, a constant in the method:
        *  final double CM_NEEDED = 15.5
        *  NOTE THERE IS NO NEED FOR PUBLIC STATIC
        * */

        // Types and variables
        System.out.println("- Types and variables");
        int exInt = 300; // Declaring variables
        System.out.println(exInt);

        double exFloating = 2.44444; // Can also use float for lower memory cost
        System.out.println(exFloating);

        String exString = "Example string"; // Note the "new String()" akin to Golang
        System.out.println(exString);

        // Arrays
        System.out.println("- Arrays");
        int[] exIntArray = {1, 4, 2}; // Determine length between []
        System.out.println(Arrays.toString(exIntArray));

        String[][] exStringDeepArray = new String[][]{{"eggplant"}, {"apple", "banana"}}; // Creating a deep String array
        System.out.println(Arrays.deepToString(exStringDeepArray));

        char[] wordArray = new char[]{'\u03C0', 'b', 'c'};
        System.out.println(wordArray);

        // Conditionals
        System.out.println("- Conditionals");
        int x = 3;
        if (x < 7) {
            System.out.println(x);
            System.out.println("x is lower than 7 \n");
        }

        for (int y = 0; y < 4; y++) {
            System.out.println(y);
        }
        
        String[] exFruits = new String[]{"bananas", "apples", "cherries"};
        for (String element:
             exFruits) {
            System.out.println(element);
        }

        // Switch expressions
        var name = "Anzle";
        String validity = switch (name) {
            case "Anzle", "March" -> "Valid";
            default -> "Invalid";
        };
        System.out.println(validity);

        System.out.println((8 & 0b1000) / 0b1000);
        /*
        *  Casting types:
        *  When you want to convert a type to another BUT data must be lost, this is called CASTING
        */

        // Casting double to int
        double toConvertX = 15.67;
        int convertedX = (int) toConvertX;
        System.out.println("Casted " + toConvertX + " double to " + convertedX);

        /*
        * TYPES
        */

        // Enumerations
        enum shirtSizes { Small, Medium, Large, XL }
        shirtSizes blueShirt = shirtSizes.Medium;
        System.out.println(blueShirt);

        /*
        * MATH CLASS
        */

        System.out.println("\n- Math class"); // Raise to power
        System.out.println(Math.pow(2, 2)); // Raise to power
        System.out.println(Math.sqrt(25)); // Square root
        System.out.println(Math.PI); // Using pi constant
        System.out.println(Math.E); // Using Euler's constant

        /*
        *  CONDITIONAL OPERATORS
        */

        /* Similar to ternary operator in JS
        *  condition ? expression1 : expression2
        * */

        var fruit1 = 5;
        var fruit2 = 6; // fruit2 > fruit1
        System.out.println(fruit1 < fruit2 ? "Fruit 1 is bigger" : "Fruit 2 is bigger");

    }
}
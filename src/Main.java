import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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
    }
}
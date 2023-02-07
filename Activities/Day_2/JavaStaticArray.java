import java.util.ArrayList;
import java.util.Scanner;


public class JavaStaticArray {
    public static String getUserInput() {
        System.out.print("Enter type of array(reverse/normal): ");
        Scanner myObj = new Scanner(System.in);
    
        String userInput = myObj.nextLine();
        System.out.println(userInput);
        return userInput;
      }
    public static void staticArray(){
        String[] strings;
        strings = new String[] {
            "First String",
            "Second String",
            "Third String",
            "Fourth String",
        };
        // ACTIVITY : STATIC ARRAY (1)
        System.out.println("Original Array printed in reverse order:");
        for(int n=strings.length-1;n>=0;n--){
            System.out.print(strings[n] + "  ");
        }
        System.out.println("\n");

        // ACTIVITY : STATIC ARRAY (2)
        String typeOfArray = getUserInput();
        if(typeOfArray.equals("normal")){
            System.out.println("Type of Array is Normal");
            for (int i = 0; i < strings.length; i++) {
                System.out.println(strings[i]);
            }
            staticArray();
        } else if(typeOfArray.equals("reverse")){
            System.out.println("Original Array printed in reverse order:");
            for(int n=strings.length-1;n>=0;n--){
                System.out.println(strings[n] + "  ");
            }
            staticArray();
        } else {
            System.out.println("Wrong Input!");
            System.exit(0);
        }
    }
    public static void dynamicArr() {
        ArrayList<String> dynamicArray = new ArrayList<String>();
        dynamicArray.add("First String");
        dynamicArray.add("Second String");
        dynamicArray.add("Third String");
        dynamicArray.add("Fourth String");
        for (int n = 0; n < dynamicArray.size(); n++) {
            System.out.println(dynamicArray.get(n));
        }
    }
    public static void multiDimenArr() {
        System.out.println("Initial Array\n");
        int[][] array = new int[10][5];
        int c = 0;
        for (int n1 = 0; n1 < 10; n1++) {
            for (int n2 = 0; n2 < 5; n2++) {
                array[n1][n2] = c++;
                System.out.print(array[n1][n2] + " ");
            }
        }

        System.out.println("\n\nAdded new line every after 5 index\n");
        int[][] array2 = new int[10][5];
        int c1 = 0;
        for (int n3 = 0; n3 < 10; n3++) {
            for (int n4 = 0; n4 < 5; n4++) {
                array2[n3][n4] = c1++;
                System.out.print(array2[n3][n4] + " ");
            }
            System.out.println("\n");
        }
        
    }
    public static void main(String[] args) {
        // staticArray();
        // dynamicArr();
        multiDimenArr();

        
    }
    
}

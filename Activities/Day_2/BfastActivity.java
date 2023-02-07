import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// ACTIVITY: BREAKFAST ACTIVITY
public class BfastActivity {
    public static void exitProgram(){
        System.exit(0);
    }
    public static void createContent(){
        System.out.print("Enter Title: ");
        try (Scanner inpTitle = new Scanner(System.in)) {
            String titleGiven = inpTitle.nextLine();

            System.out.print("Enter Description: ");
            try (Scanner inpDesc = new Scanner(System.in)) {
                String descGiven = inpDesc.nextLine();
                String appendContent = titleGiven + ": " + descGiven + "\n";
                try {
                    Files.write(Paths.get("C:\\Users\\CL-1\\Desktop\\Caguan_SVTC_OJT\\Activities\\Day_2\\myfile.txt"), appendContent.getBytes(), StandardOpenOption.APPEND);
                    System.out.println("Content Updated!");
                }catch (IOException e) {
                    //exception handling left as an exercise for the reader
                }
            }
        }
    }
    public static String getUserChoice() {
        System.out.print("Enter number to choose: ");
        try (Scanner myObj = new Scanner(System.in)) {
            String userChoice = myObj.nextLine();
            return userChoice;
        }
      }
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        
        System.out.println("1. Display Contents");
        System.out.println("2. Sort Contents in Ascending Order");
        System.out.println("3. Sort Contents in Descending Order");
        System.out.println("4. Count Contents");
        System.out.println("5. Search by Title");
        System.out.println("6. Search by Description");
        System.out.println("7. Add Content");
        System.out.println("8. Exit Program");

        try {
            File myObj = new File("C:\\Users\\CL-1\\Desktop\\Caguan_SVTC_OJT\\Activities\\Day_2\\myfile.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              array.add(data);
            }
            myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        String choices = getUserChoice(); //user input
        switch (choices) {
            case "1": // display
                for (int i = 0; i < array.size(); i++) {
                    System.out.println(array.get(i) + "\n");
                }
                main(args);
            case "2": // sort contents ascending
                Collections.sort(array);
                System.out.println("Array in ascending order: ");
                for (int i = 0; i < array.size(); i++) {
                    System.out.println(array.get(i) + "\n");
                }
                main(args);
            case "3": // sort contents descending
                Collections.sort(array, Collections.reverseOrder());

                /* Sorted List in reverse order*/
                System.out.println("Array in descending order: ");
                for(String str: array){
                    System.out.println(str + "\n");
                }
                main(args);
            case "4": // count contents of array
                System.out.println("The size of the ArrayList is: " + array.size() + "\n");
                main(args);
            case "5": // filter by title
                System.out.print("Enter Title to find: ");
                Scanner findInpTitle = new Scanner(System.in);
                String findTitle = findInpTitle.nextLine();

                for (String element : array){
                    if (element.contains(findTitle)){
                        System.out.println("Titles found: ");
                        System.out.println(element);
                    }
                }
                System.out.println("\n");
                main(args);
            case "6": // filter by description
                System.out.print("Enter Description to find: ");
                Scanner findInpDesc = new Scanner(System.in);
                String findDesc = findInpDesc.nextLine();

                for (String element : array){
                    if (element.contains(findDesc)){
                        System.out.println("Descriptions found: ");
                        System.out.println(element);
                    }
                }
                System.out.println("\n");
                main(args);
            case "7": // add content to the array
                createContent();
                System.out.println("\n");
                main(args);
            case "8":
                exitProgram();
            default: // exit program
                System.out.println("Wrong input!");
        }
        
        
    }
}
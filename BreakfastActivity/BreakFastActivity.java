import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections; 
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class BreakFastActivity {
  
  static ArrayList<String> meals = new ArrayList<>(Arrays.asList("Breakfast: Coffee", "Breakfast: Energen", "Breakfast: Tea"));


    static void display()
    {
        // Creating an ArrayList object
        // (Declaring List of String type)
        
 
        // Adding (appending) elements to List
        // Custom inputs using add() method
        // breakfast.add("Breakfast: coffee");
        // breakfast.add("Breakfast2: energen");
        // breakfast.add("Breakfast3: tea");
 
        // Printing all the elements of ArrayList
        // Declaring generic ArrayList of String type
        System.out.print(meals);
    }
    //--------------------------------------------------------------------------------------
        static void sortAsc()   
    {   
    //defining an array of integer type 
    // String a = "Breakfast1"; 
    // String b = "Breakfast2";
    // String c = "Breakfast3";
    // String [] array = new String [] {" Breakfast:Tea", " Breakfast:Energen", " Breakfast:Coffee" }; 
    
    //invoking sort() method of the Arrays class  
    Collections.sort(meals); 
    System.out.println("Breakfast in ascending order: ");  
    //prints array using the for loop  
    for (int i = 0; i < meals.size(); i++)   
    {       
    System.out.println(meals.get(i));   
    }   
    }  
    //-----------------------------------------------------------------------------------
      void desc() {

        // String array [] ={"Breakfast: Coffee", "Breakfast: Energen", "Breakfast: Tea"};
        Collections.sort(meals, Collections.reverseOrder());
        System.out.println("Breakfast in descending order:  ");
        for (int i =0; i <meals.size(); i++){
            System.out.println(meals.get(i));
        }
        
    }
   //------------------------------------------------------------------------------------
     static void count(){
        // String strArr[] = { "Breakfast: Tea", "Breakfast: Energen", "Breakfast: Coffee" };
        Set<String> s = new HashSet<>(meals);
        System.out.println("Elements: "+s);
        System.out.println("Number of Elements: "+s.size());
    }
    //---------------------------------------------------------------------------------
    //  static void keysearch() 
    // {
    //   String A = "Breakfast: Coffee";
    //   String B = "Breakfast: ";
    //   String C = "Breakfast: Coffee";
    //   String array[] {}
      
    // }

    // // static void keysearch(){}
    // // static void dsearch(){}
    //------------------------------------------------------------------------------------
    public static void main(String[]args) {
      BreakFastActivity obj = new BreakFastActivity();
      // to run enter the specific method
      obj.count();

    


    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections; 
import java.util.HashSet;
import java.util.Set;
public class BreakFastActivity {

    // static void display(String[] args)
    // {
    //     // Creating an ArrayList object
    //     // (Declaring List of String type)
    //     ArrayList<String> breakfast = new ArrayList<String>();
 
    //     // Adding (appending) elements to List
    //     // Custom inputs using add() method
    //     breakfast.add("Breakfast: coffee");
    //     breakfast.add("Breakfast2: energen");
    //     breakfast.add("Breakfast3: tea");
 
    //     // Printing all the elements of ArrayList
    //     // Declaring generic ArrayList of String type
    //     System.out.print(breakfast);
    // }
    
    //     static void sortAsc(String[] args)   
    // {   
    // //defining an array of integer type 
    // // String a = "Breakfast1"; 
    // // String b = "Breakfast2";
    // // String c = "Breakfast3";
    // String [] array = new String [] {" Breakfast:Tea", " Breakfast:Energen", " Breakfast:Coffee" }; 
    
    // //invoking sort() method of the Arrays class  
    // Arrays.sort(array);   
    // System.out.println("Breakfast in ascending order: ");  
    // //prints array using the for loop  
    // for (int i = 0; i < array.length; i++)   
    // {       
    // System.out.println(array[i]);   
    // }   
    // }  

    //  static void desc(String[] args) {

    //     String array [] ={"Breakfast: Coffee", "Breakfast: Energen", "Breakfast: Tea"};
    //     Arrays.sort(array, Collections.reverseOrder());
    //     System.out.println("Breakfast in descending order:  ");
    //     for (int i =0; i <array.length; i++){
    //         System.out.println(array[i]);
    //     }
        
    // }
    // static void display(ArraysList){}
    // static void sortAsc(){}
    // static void sortDesc(){}
    static void count(String[] a ){
        String strArr[] = { "P", "Q", "R" };
      Set s = new HashSet(Arrays.asList(strArr));
      System.out.println("Elements: "+s);
      System.out.println("Number of Elements: "+s.size());
    }
    // static void keysearch(){}
    // static void dsearch(){}

}
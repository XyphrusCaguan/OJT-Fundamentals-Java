import java.util.Arrays;
import java.util.Scanner;
public class test {

    public static void main(String[] args) {
      
        String[] strings = new String[] { "First string", "Second string", "Third string", "Fourth string" };
        strings[0] ="Replaced first string";
        Scanner tae= new Scanner(System.in);
        String input = null;
        System.out.println("Reversed Array :\n" + Arrays.toString(strings));
        input = tae.nextLine();
        if (input.contains("java Static Array normal")){ 
        for(int n = 0; n < strings.length; n++) {
        System.out.println(strings[n]); 
            
            // String j = strings[n];
            // strings[n] = strings[strings.length - n - 1];
            // strings[strings.length - n - 1] = j;
        }
    }
        // Output
        
    }
}

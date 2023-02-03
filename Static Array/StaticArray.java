import java.util.Arrays;
import java.util.Scanner;
public class StaticArray {

    public static void main(String[] args) {
      
        String[] strings = new String[] { "First string", "Second string", "Third string", "Fourth string" };
        strings[0] ="Replaced first string";
    
        for(int n = 0; n < strings.length / 2; n++) {
        System.out.println("Reversed Array :\n" + Arrays.toString(strings));
            String j = strings[n];
            strings[n] = strings[strings.length - n - 1];
            strings[strings.length - n - 1] = j;
        }
        // Output
        
    }
}

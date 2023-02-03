// package day3;
import java.util.Scanner;
public class activity1 {

    public static void main(String[]args){
        String[] strings;
        Scanner sc = new Scanner(System.in);
        String input="";
        strings = new String[]{
            "First String",
            "Second String",
            "Third String",
            "Fourth String",
        };
        System.out.println("Waiiiiiit");
           input = sc.nextLine();
           
           if(input.contains("java JavaStaticArray normal")){
            for(int n=0;n<strings.length; n++){
                System.out.println(strings[n]);
            }
           }
           else if(input.contains("java JavaStaticArray reverse")){
            for(int n=strings.length-1;n>=0; n--){
                System.out.println(strings[n]);
            }
           }
           else{
            System.out.println("Error");
           }
        
        
    }


}

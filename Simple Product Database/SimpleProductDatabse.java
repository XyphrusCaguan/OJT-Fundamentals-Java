import java.util.ArrayList;
public class SimpleProductDatabse {

       public static void main(String[] args){
        ArrayList<String> dynamicArray = new ArrayList<String>();
        dynamicArray.add("Product: Mitsubishi");
        dynamicArray.add(" Price: 8000000");
        dynamicArray.add("Price: 15$");
        dynamicArray.add("Product: Venti");
        for(int n=3; n<dynamicArray.size(); n++){
            // System.out.println(dynamicArray.get(n));
            String a = dynamicArray.get(0);
            String b = dynamicArray.get(1);
            String c = dynamicArray.get(2);
            String d = dynamicArray.get(3);
            System.out.println(a+", "+b +"\n" + d+", "+c);
            
        }
    
       }
    
        
    }
    

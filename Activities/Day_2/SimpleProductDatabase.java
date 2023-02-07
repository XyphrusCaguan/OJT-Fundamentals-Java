import java.util.ArrayList;

public class SimpleProductDatabase {
    public static void main(String[] args) {
      ArrayList<String> productname = new ArrayList<String>();
      productname.add("Tesla Model S");
      productname.add("Banana");
      productname.add("Jeans");
      productname.add("Textbook");
      productname.add("Tennis Racket");
  
      ArrayList<Integer> price = new ArrayList<Integer>();
      price.add(2000000);
      price.add(20);
      price.add(1000);
      price.add(1500);
      price.add(2500);
  
      for (int i = 0; i < 5; i++) {
        System.out.println("Product: " + productname.get(i) + ", Price: " + price.get(i));
      }
    }
  }
  
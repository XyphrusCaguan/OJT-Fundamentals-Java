public class MyIfElseProgram {
    public static void main(String[] args) {
        int n;
        for (n = 0; n <= 20; n++) {
            if (n == 0) { // index zero
                System.out.println("First one: " + n); 
            } 
            else if(n<5){ // integer 1 -> 4
                System.out.println("Less than five: " + n); 
            } 
            else if((n == 10) || (n == 11)){ // integer 10 and 11
                System.out.println("Ten or Eleven: (" + n + ") "); 
            }
            else if((n > 12) && (n < 19)){ // integer 13 ->18
                System.out.println("YEHEY!"); 
            } else { // greater than five till max number(20) 
                System.out.println("NOT less than five: " + n);
            }
        }
    }
}

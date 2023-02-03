public class JavaFunctions {
// double or float instead of int to get the correct results
    static double myFuction(double x){
        return(x / 2);
    }

    public static void main(String[] args) {
        for(int x=0; x<10; x++){
            System.out.println("f(" + x +") = " + myFuction(x));
        }
        
    }
}
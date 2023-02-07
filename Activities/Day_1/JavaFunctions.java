public class JavaFunctions{
    static float MyFunction(float x){
        // will receive the value of x in the loop x < 12
        return(x/2);
    }

    public static void main(String[] args) {
        // loop through the array of number
        for (float x = 0; x < 12.; x++) {
            // for every x that is being looped
            // the function MyFunction will be called
            // and will return the answer x/2
            System.out.println("f(" + x + ") = " + MyFunction(x));
        }
    }
}
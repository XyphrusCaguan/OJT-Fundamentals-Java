public class Concatinate {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String str = "";
        
        for (int i = 0; i <= 100000; i++) {
            System.out.print(str + "x" );
        }
        long stopTime = System.nanoTime();
        long totalTime = stopTime - startTime;
        double nanoSecond = 0.000000001D;
        double timeInSeconds = nanoSecond * totalTime;
        System.out.println("\n" + timeInSeconds + " second in normal compile"); // normal compile
        

        long startTime2 = System.nanoTime();
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i <= 100000; i++) {
            builder.append("x");
        }
        System.out.println(builder);
        long stopTime2 = System.nanoTime();
        long totalTime2 = stopTime2 - startTime2;
        double nanoSecond2 = 0.000000001D;
        double timeInSeconds2 = nanoSecond2 * totalTime2;
        System.out.println("\n" + timeInSeconds2 + " second in string builder"); // stringbuilder

        long startTime3 = System.nanoTime();
        String str2 = "";
        for (int i = 0; i <= 100000; i++) {
            StringBuffer tmp = new StringBuffer(str2);
            tmp.append("x");
            str2 = tmp.toString();
            
        }
        System.out.print(str2);
        long stopTime3 = System.nanoTime();
        long totalTime3 = stopTime3 - startTime3;
        double nanoSecond3 = 0.000000001D;
        double timeInSeconds3 = nanoSecond3 * totalTime3;
        System.out.println("\n" + timeInSeconds3 + " second in string buffer"); // stringbuffer
        
    }
    
}

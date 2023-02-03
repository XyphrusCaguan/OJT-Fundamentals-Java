public class StringConcatenation{
    public static void main(String[] args)
    {
        
        // StringBuilder stringBuilder = new StringBuilder("");
        // for(int x = 1; x <= 10000; x++)
        // {
        //     stringBuilder.append("x");
        // }
        // System.out.println(stringBuilder);

        String str = "";
        for (int i = 0; i <= 100000; i++) {
            StringBuffer stringBuffer = new StringBuffer(str);
            stringBuffer.append("x");
            str = stringBuffer.toString();
        }
        System.out.println(str);
    }
}
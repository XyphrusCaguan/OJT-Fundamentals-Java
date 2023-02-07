public class Classes {
    static class Counter{

        public int value = 0;
        
    }
    public class CounterMain{
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        
        
    }
    

   
    public static void main(String[]args){
        
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        counter1.value=counter1.value+2;
        counter2.value++;
        
        
        
        System.out.println("counter value: "+ counter1.value);
        System.out.println("counter value: "+ counter2.value);
  
    
    }
}
        import java.util.ArrayList;
        import java.util.Random;
        public class MemorableQuotes1Copy /*extends MemoreableQuotes*/  {
          public static void main(String[] args) {
            if (args.length == 0) {
              System.out.println("Error: Please supply a parameter.");
              System.out.println("Possible parameters: 'create', 'random', 'all'");
              return;
            }
          
            ArrayList<String> BibleQuotes = new ArrayList<>();
            BibleQuotes.add("I can do all this through him who gives me strength.@Philippians 4:13");
            BibleQuotes.add("When I am afraid, I put my trust in you.@Psalms 56:3");
            BibleQuotes.add("A friend loves at all times, and a brother is born for a time of adversity.@Proverbs 17:17");
            BibleQuotes.add("Cast all your anxiety on him because he cares for you.@1 Peter 5:7");
            BibleQuotes.add("Fear not, for I am with you; be not dismayed, for I am your God; I will strengthen you, I will help you, I will uphold you with my righteous right hand.@Isaiah 41:10");
            BibleQuotes.add("You will keep in perfect peace those whose minds are steadfast, because they trust in you.@Isaiah 26:3");
            
            
          //   static void printQuote(String quote) {
          //     String[] parts = quote.split("@");
          //     for (String part : parts) {
          //         System.out.println(part);
          //     }
          // }
          
            if (args[0].equals("create")) {
              createQuotes(BibleQuotes);
            } else if (args[0].equals("random")) {
              String myRandomQuote = getRandomQuote(BibleQuotes);
              System.out.println("Random memorable quote: " + myRandomQuote);
            } else if (args[0].equals("all")) {
              if (BibleQuotes.isEmpty()) {
                System.out.println("Error: Quotes array is empty. Please create quotes first.");
                return;
              }
              System.out.println("All memorable quotes:");
              for (String quote : BibleQuotes) {
                System.out.println(quote);
              }
            } else {
              System.out.println("Error: Invalid parameter supplied.");
              System.out.println("Possible parameters: 'create', 'random', 'all'");
            }
          }
          
          // ArrayList<String> BibleQuotes = new ArrayList<>();
          public static void createQuotes(ArrayList<String> BibleQuotes){}
            // BibleQuotes.add("I can do all this through him who gives me strength.@Philippians 4:13");
            // BibleQuotes.add("When I am afraid, I put my trust in you.@Psalms 56:3");
            // BibleQuotes.add("A friend loves at all times, and a brother is born for a time of adversity.@Proverbs 17:17");
            // BibleQuotes.add("Cast all your anxiety on him because he cares for you.@1 Peter 5:7");
            // BibleQuotes.add("Fear not, for I am with you; be not dismayed, for I am your God; I will strengthen you, I will help you, I will uphold you with my righteous right hand.@Isaiah 41:10");
            // BibleQuotes.add("You will keep in perfect peace those whose minds are steadfast, because they trust in you.@Isaiah 26:3");

            public static void printQuote(String BibleQuotes) {
              String[] quoteParts = BibleQuotes.split("@");
              for (String quotePart : quoteParts) {
                System.out.println(quotePart);
              }
            }
              
          public static String getRandomQuote(ArrayList<String> quotes) {
            Random random = new Random();
            int randomIndex = random.nextInt(quotes.size());
            return quotes.get(randomIndex);

            
          }

         
          
            // ArrayList<String> random_quote_array_list = new ArrayList<>();
              // Random rand = new Random();
              // int random_num = rand.nextInt(BibleQuotes.size() - 1);
              // String random_quote = BibleQuotes.get(random_num);
              // random_quote_array_list.add(random_quote);
              // System.out.println(random_quote_array_list);
            
            
          
          
          // public static void printQuote(String quote) {
          //   System.out.println("Memorable quote: " + quote);
          // }
        }
    
    // public static void main(String[] args){
    // System.out.println();
    // Random rand = new Random();
    // System.out.println(BibleQuotes[rand.nextInt(BibleQuotes.length)]);

        

    //  static void createQuotes(ArrayList<String> quotes) {
        
    //   }
    //   static String getRandomQuote(ArrayList<String> quotes){
    //     return(.. FIXME: Must return something here .. );
    //   }
    //   createQuotes(youarrayvariable);
    //   String myRandomQuote = getRandomQuote(yourarrayvariable);

    

   
      
    
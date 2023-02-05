        import java.util.ArrayList;
        import java.util.Random;
        public class MemorableQuotes1 /*extends MemoreableQuotes*/  {
          public static void main(String[] args) {
            if (args.length == 0) {
              System.out.println("Error: Please supply a parameter.");
              System.out.println("Possible parameters: 'create', 'random', 'all' , 'search', 'csearch' ");
              return;
            }
            

            ArrayList<String> BibleQuotes = new ArrayList<>();
            BibleQuotes.add("I can do all this through him who gives me strength.@Philippians 4:13");
            BibleQuotes.add("When I am afraid, I put my trust in you.@Psalms 56:3");
            BibleQuotes.add("A friend loves at all times, and a brother is born for a time of adversity.@Proverbs 17:17");
            BibleQuotes.add("Cast all your anxiety on him because he cares for you.@1 Peter 5:7");
            BibleQuotes.add("Fear not, for I am with you; be not dismayed, for I am your God; I will strengthen you, I will help you, I will uphold you with my righteous right hand.@Isaiah 41:10");
            BibleQuotes.add("You will keep in perfect peace those whose minds are steadfast, because they trust in you.@Isaiah 26:3");
            
          
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
            } 

            else if (args[0].equals("search")) {
              if (args.length < 2) {
                System.out.println("Error: Please supply a word to search.");
                return;
              }
              String wordToSearch = args[1];
              System.out.println("Search results for '" + wordToSearch + "':");
              boolean found = false;
              for (String quote : BibleQuotes) {
                if (quote.contains(wordToSearch)) {
                  System.out.println(quote);
                  found = true;
                }
              }
              if (!found) {
                System.out.println("No results found.");
              }
            }
            else if (args[0].equals("csearch")) {
              if (args.length < 2) {
                System.out.println("Error: Please supply a word to search.");
                return;
              }
              String wordToSearch = args[1];
              System.out.println("Content search results for '" + wordToSearch + "':");
              boolean found = false;
              for (String quote : BibleQuotes) {
                String[] quoteParts = quote.split("@");
                if (quoteParts[0].contains(wordToSearch)) {
                  System.out.println(quote);
                  found = true;
                }
              }
              if (!found) {
                System.out.println("No results found.");
              }
            }
   
            // 
            else {
              System.out.println("Error: Invalid parameter supplied.");
              System.out.println("Possible parameters: 'create', 'random', 'all'");
            }
          }
          
          
          public static void createQuotes(ArrayList<String> BibleQuotes){}
            
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

        }
    
   
    


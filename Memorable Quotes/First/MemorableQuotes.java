import java.util.ArrayList;
import java.util.Random;

public class MemorableQuotes {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Error: Please supply a parameter.");
      System.out.println("Possible parameters: 'create', 'random', 'all'");
      return;
    }
  
    ArrayList<Quote> BibleQuotes = new ArrayList<>();
    BibleQuotes.add(new Quote("I can do all this through him who gives me strength.", "Philippians 4:13"));
    BibleQuotes.add(new Quote("When I am afraid, I put my trust in you.", "Psalms 56:3"));
    BibleQuotes.add(new Quote("A friend loves at all times, and a brother is born for a time of adversity.", "Proverbs 17:17"));
    BibleQuotes.add(new Quote("Cast all your anxiety on him because he cares for you.", "1 Peter 5:7"));
    BibleQuotes.add(new Quote("Fear not, for I am with you; be not dismayed, for I am your God; I will strengthen you, I will help you, I will uphold you with my righteous right hand.", "Isaiah 41:10"));
    BibleQuotes.add(new Quote("You will keep in perfect peace those whose minds are steadfast, because they trust in you.", "Isaiah 26:3"));

    if (args[0].equals("create")) {
      createQuotes(BibleQuotes);
    } else if (args[0].equals("random")) {
      Quote myRandomQuote = getRandomQuote(BibleQuotes);
      System.out.println("Random memorable quote: " + myRandomQuote.quote + " - " + myRandomQuote.reference);
    } else if (args[0].equals("all")) {
      if (BibleQuotes.isEmpty()) {
        System.out.println("Error: Quotes array is empty. Please create quotes first.");
        return;
      }
      System.out.println("All memorable quotes:");
      for (Quote quote : BibleQuotes) {
        System.out.println(quote.quote + " - " + quote.reference);
      }
    } else {
      System.out.println("Error: Invalid parameter supplied.");
      System.out.println("Possible parameters: 'create', 'random', 'all'");
    }
  }

  public static void createQuotes(ArrayList<Quote> BibleQuotes) {}

  public static Quote getRandomQuote(ArrayList<Quote> quotes) {
    Random random = new Random();
    int randomIndex = random.nextInt(quotes.size());
    return quotes.get(randomIndex);
  }

  private static class Quote {
    private final String quote;
    private final String reference;

    public Quote(String quote, String reference) {
      this.quote = quote;
      this.reference = reference;
    }
  }
}

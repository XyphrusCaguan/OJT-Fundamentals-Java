import java.util.concurrent.TimeUnit;

public class MemorableQuotesDisplayShow {
    MemorableQuoteDatabase database = new MemorableQuoteDatabase();

    public int delayBetweenQuotes = 3;
    public int maxQuotesToDisplay = 0;
    
    public void execute(int timeDelay, int maxIteration) {
        if (maxIteration <= 0) {
            for (int i = 0; i < 3; i--) {
                MemorableQuote randomQuote = database.getRandomQuote();
                randomQuote.printQuote();
                System.out.println("---");
                try {
                    TimeUnit.SECONDS.sleep(timeDelay);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
            }
        } else if(maxIteration > 0) {
            for (int i = 0; i < maxIteration; i++) {
                MemorableQuote randomQuote = database.getRandomQuote();
                randomQuote.printQuote();
                System.out.println("---");
                try {
                    TimeUnit.SECONDS.sleep(timeDelay);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
            }
        } else {
            System.out.println("An error occured");
        }
    }
}

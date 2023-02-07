import java.util.ArrayList;
import java.util.Random;

class MemorableQuoteDatabase {
    private ArrayList<MemorableQuote> quotes;

    public MemorableQuoteDatabase() {
        quotes = new ArrayList<MemorableQuote>();
        quotes.add(new MemorableQuote("The greatest glory in living lies not in never falling, but in rising every time we fall.", "Nelson Mandela"));
        quotes.add(new MemorableQuote("The way to get started is to quit talking and begin doing. ", "Walt Disney"));
        quotes.add(new MemorableQuote("The future belongs to those who believe in the beauty of their dreams.", "Eleanor Roosevelt"));
        quotes.add(new MemorableQuote("It is during our darkest moments that we must focus to see the light. ", "Aristotle"));
    }

    public void addQuote(MemorableQuote quote) {
        quotes.add(quote);
    }

    public void removeQuote(MemorableQuote quote) {
        quotes.remove(quote);
    }

    public int getQuoteCount() {
        return quotes.size();
    }

    public MemorableQuote getQuoteByIndex(int n) {
        if (n >= 0 && n < quotes.size()) {
            return quotes.get(n);
        }
        return null;
    }

    public ArrayList<MemorableQuote> getAllQuotes() {
        return quotes;
    }

    public MemorableQuote getRandomQuote() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(quotes.size());
        return quotes.get(randomIndex);
    }

    public ArrayList<MemorableQuote> searchQuotes(String text) {
        ArrayList<MemorableQuote> matchingQuotes = new ArrayList<MemorableQuote>();
        for (MemorableQuote quote : quotes) {
            if (quote.matches(text)) {
                matchingQuotes.add(quote);
            }
        }
        return matchingQuotes;
    }
}






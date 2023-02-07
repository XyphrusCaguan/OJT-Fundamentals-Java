import java.util.ArrayList;

public class MemorableQuotesMain {
    public static void main(String[] args) {
        MemorableQuotesDisplayShow showData = new MemorableQuotesDisplayShow();
        MemorableQuoteDatabase database = new MemorableQuoteDatabase();
        database.addQuote(new MemorableQuote("The best preparation for tomorrow is doing your best today.", "H. Jackson Brown Jr."));
        database.addQuote(new MemorableQuote("Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle.", "Christian D. Larson"));
        database.addQuote(new MemorableQuote("Success is not final, failure is not fatal: it is the courage to continue that counts.", "Winston S. Churchill"));
        database.addQuote(new MemorableQuote("The only way to do great work is to love what you do.", "Steve Jobs"));

        if (args.length == 0) {
            System.out.println("Please provide a command.");
        } else if (args[0].equals("all")) {
            ArrayList<MemorableQuote> allQuotes = database.getAllQuotes();
            for (MemorableQuote quote : allQuotes) {
                quote.printQuote();
                System.out.println("---");
            }
        } else if (args[0].equals("random")) {
            MemorableQuote randomQuote = database.getRandomQuote();
            randomQuote.printQuote();
            System.out.println("---");
        } else if (args[0].equals("search")) {
            if (args.length < 2) {
                System.out.println("Please provide a search string.");
            } else {
                String searchString = args[1];
                ArrayList<MemorableQuote> searchResult = database.searchQuotes(searchString);
                for (MemorableQuote quote : searchResult) {
                    quote.printQuote();
                    System.out.println("---");
                }
            }
        } else if (args[0].equals("display")) {
            int timeDelay = Integer.parseInt(args[1]);
            int maxIteration = Integer.parseInt(args[2]);
            showData.execute(timeDelay, maxIteration);
        } else if (args[0].equals("display2")) {
            int timeDelay = Integer.parseInt(args[1]);
            int maxIteration = Integer.parseInt(args[2]);
            System.out.println(timeDelay + " " + maxIteration);
            showData.secondExecute(timeDelay, maxIteration);
        } else {
            System.out.println("Unknown command.");
        }
        }
    }

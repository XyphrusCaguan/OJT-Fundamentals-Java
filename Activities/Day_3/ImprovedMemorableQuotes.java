import java.util.ArrayList;
import java.util.Random;

public class ImprovedMemorableQuotes {
    

    public class MemorableQuote{
        String quoteText;
        public void getText(String quoteText){
        this.quoteText = quoteText;
    }
    }

    public class MemorableQuotesMain {
        
    }
    
    public static void main(String[] args) {
        ArrayList<String> MemorableQuote = new ArrayList<>();
        MemorableQuote.add("Love is composed of a single soul inhabiting two bodies.@Aristotle@Love");
        MemorableQuote.add("A dog is the only thing on earth that loves you more than he loves himself.@Josh Billings@Love");
        MemorableQuote.add("All love is sweet, Given or returned. Common as light is love, And its familiar voice wearies not ever. They who inspire is most are fortunate, As I am now: but those who feel it most Are happier still.@Percy Bysshe Shelley@Love");
        MemorableQuote.add("The love we give away is the only love we keep.@Elbert Hubbard@Love");

        Random rand = new Random();
        int randomIndex = rand.nextInt(MemorableQuote.size());
        String getString = MemorableQuote.get(randomIndex);
        System.out.println(getString);
    }
}

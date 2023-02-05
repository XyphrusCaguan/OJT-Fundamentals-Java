import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.HashMap;
import java.util.Map;

public class MemorableQuotes1 {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Error: Please supply a parameter.");
      System.out.println("Possible parameters: 'create', 'random', 'all' , 'search', 'csearch', 'display1', 'display2' , 'display3'");
      return;
    }
  
    if (args[0].equals("create")) {
      System.out.println(createQuotes()); 
    } else if (args[0].equals("random")) {
      System.out.println(getRandomQuote());
    } else if (args[0].equals("all")) {
      createQuotes();
      for (int i = 0; i < createQuotes().size(); i++) {
        System.out.println(createQuotes().get(i));
      }
    } else if (args[0].equals("search")) {
      searchAuthor(args);
    } else if (args[0].equals("csearch")) {
      searchContent(args);
    } else if (args[0].equals("category")) {
      searchCategory(args);
    } else if (args[0].equals("display")) {
      maxIterationTimeDisplay(args);
    } else {
      System.out.println("Error: Invalid parameter supplied.");
      System.out.println("Possible parameters: 'create', 'random', 'all' , 'search', 'csearch' , 'category', 'display'");
    }
  }

  public static ArrayList<String> createQuotes(){
    ArrayList<String> createdQuotes = new ArrayList<>();
    ArrayList<String> splittedQuotes = new ArrayList<>();
    try {
      File myObj = new File("quotes.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        // System.out.println(data);
        createdQuotes.add(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    for (int j = 0; j < createdQuotes.size(); j++) {
      String content = createdQuotes.get(j).split("@")[0];
      String reference = createdQuotes.get(j).split("@")[1];
      String category = createdQuotes.get(j).split("@")[2];
      splittedQuotes.add(content + "\n--" + reference + "\n--" + category);
    }
    
    return splittedQuotes;
  }

  public static String getRandomQuote() {
    createQuotes();
    Random random = new Random();
    int randomIndex = random.nextInt(createQuotes().size());
    String randomQuote = createQuotes().get(randomIndex);
    return randomQuote;
  }

  public static void searchAuthor(Object[] args) {
    String findAuthor = args[1].toString();
    for (String element : createQuotes()){
      if (element.toLowerCase().contains(findAuthor.toLowerCase())){
            System.out.println(element);
      }
    }
  }

  public static void searchContent(Object[] args) {
    String findContent = args[1].toString() + " " + args[2].toString();
    for (String element : createQuotes()){
      if (element.toLowerCase().contains(findContent.toLowerCase())){
            System.out.println(element);
      }
    }
  }

  public static void searchCategory(Object[] args) {
    String findContent = args[1].toString();
    for (String element : createQuotes()){
      if (element.toLowerCase().contains(findContent.toLowerCase())){
            System.out.println(element);
      }
    }
  }

  public static void maxIterationTimeDisplay(Object[] args) {
    int timeDelay = Integer.parseInt(args[1].toString());
    int maxIteration = Integer.parseInt(args[2].toString());
    for (int i = 0; i < maxIteration; i++) {
      System.out.println(getRandomQuote());
      try {
        TimeUnit.SECONDS.sleep(timeDelay);
    } catch (InterruptedException ie) {
        System.out.println("Interrupted...");
    }
    }

  }
}





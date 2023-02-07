import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.Map;

public class MemorableQuotes7 {

public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Error: Please supply a parameter.");
      System.out.println("Possible parameters: 'create', 'random', 'all' , 'search', 'csearch', 'display, 'add', 'modify', 'delete'");
      return;
    }
  
    if (args[0].equals("create")) {
        System.out.println(getQuotesFromTextFile());
        Map<String, Long> counterMap = getQuotesFromTextFile().stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
        String updateQuoteCount = args[0] + " " + counterMap;
        System.out.println(updateQuoteCount);
        quoteCounter(updateQuoteCount);
    } else if (args[0].equals("random")) {
        getRandomQuote();
        Map<String, Long> counterMap = getRandomQuote().stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
        String updateQuoteCount = args[0] + " " + counterMap;
        System.out.println(updateQuoteCount);
        quoteCounter(updateQuoteCount);
    } else if (args[0].equals("all")) {
        createQuotes();
        for (int i = 0; i < createQuotes().size(); i++) {
            System.out.println(createQuotes().get(i)+ "\n");
        }
        Map<String, Long> counterMap = getQuotesFromTextFile().stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
        String updateQuoteCount = args[0] + " " + counterMap;
        System.out.println(updateQuoteCount);
        quoteCounter(updateQuoteCount);
    } else if (args[0].equals("search")) {
        searchAuthor(args);
        Map<String, Long> counterMap = searchAuthor(args).stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
        String updateQuoteCount = args[0] + " " + counterMap;
        System.out.println(updateQuoteCount);
        quoteCounter(updateQuoteCount);
    } else if (args[0].equals("csearch")) {
        searchContent(args);
        Map<String, Long> counterMap = searchContent(args).stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
        String updateQuoteCount = args[0] + " " + counterMap;
        System.out.println(updateQuoteCount);
        quoteCounter(updateQuoteCount);
    } else if (args[0].equals("category")) {
        searchCategory(args);
        Map<String, Long> counterMap = searchCategory(args).stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
        String updateQuoteCount = args[0] + " " + counterMap;
        System.out.println(updateQuoteCount);
        quoteCounter(updateQuoteCount);
    } else if (args[0].equals("display")) {
        maxIterationTimeDisplay(args);
    } else if (args[0].equals("add")) {
        addContent();
        Map<String, Long> counterMap = addContent().stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
        String updateQuoteCount = args[0] + " " + counterMap;
        System.out.println(updateQuoteCount);
        quoteCounter(updateQuoteCount);
    } else if (args[0].equals("modify")) {
        modifyContent(getQuotesFromTextFile());
        Map<String, Long> counterMap = modifyContent(getQuotesFromTextFile()).stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
        String updateQuoteCount = args[0] + " " + counterMap;
        System.out.println(updateQuoteCount);
        quoteCounter(updateQuoteCount);
    } else if (args[0].equals("delete")) {
        deleteContent(getQuotesFromTextFile());
    } else {
      System.out.println("Error: Invalid parameter supplied.");
      System.out.println("Possible parameters: 'create', 'random', 'all' , 'search', 'csearch' , 'category', 'display', 'add', 'modify', 'delete'");
    }
    
  }

  public static ArrayList<String> getQuotesFromTextFile() {
    ArrayList<String> createdQuotes = new ArrayList<>();
    try {
        File myObj = new File("Quotes.txt");
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
    return createdQuotes;
  }

  public static ArrayList<String> createQuotes(){
    getQuotesFromTextFile();
    ArrayList<String> splittedQuotes = new ArrayList<>();
    
    for (int j = 0; j < getQuotesFromTextFile().size(); j++) {
      String content = getQuotesFromTextFile().get(j).split("@")[0];
      String reference = getQuotesFromTextFile().get(j).split("@")[1];
      String category = getQuotesFromTextFile().get(j).split("@")[2];
      splittedQuotes.add(content + "\n--" + reference + "\n--" + category);
    }
    
    return splittedQuotes;
  }

  public static ArrayList<String> getRandomQuote() {
    ArrayList<String> randomArrayList = new ArrayList<String>();
    createQuotes();
    Random random = new Random();
    int randomIndex = random.nextInt(createQuotes().size());
    System.out.println(createQuotes().get(randomIndex));
    randomArrayList.add(createQuotes().get(randomIndex));
    return randomArrayList;
  }

  public static ArrayList<String> searchAuthor(Object[] args) {
    ArrayList<String> findListAuthor = new ArrayList<>();
    String findAuthor = args[1].toString();
    for (String element : createQuotes()){
      if (element.toLowerCase().contains(findAuthor.toLowerCase())){
            System.out.println(element + "\n");
            findListAuthor.add(element);
      }
    }
    return findListAuthor;
  }

  public static ArrayList<String> searchContent(Object[] args) {
    ArrayList<String> findListContent = new ArrayList<>();
    String findContent = args[1].toString() + " " + args[2].toString();
    for (String element : createQuotes()){
      if (element.toLowerCase().contains(findContent.toLowerCase())){
            System.out.println(element + "\n");
            findListContent.add(element);
      }
    }
    return findListContent;
  }

  public static ArrayList<String>  searchCategory(Object[] args) {
    ArrayList<String> findListCategory = new ArrayList<>();
    String findContent = args[1].toString();
    for (String element : createQuotes()){
      if (element.toLowerCase().contains(findContent.toLowerCase())){
            System.out.println(element + "\n");
            findListCategory.add(element);
      }
    }
    return findListCategory;
  }

  public static Map<String, Long> maxIterationTimeDisplay(Object[] args) {
    ArrayList<String> maxArrayList = new ArrayList<>();
    int timeDelay = Integer.parseInt(args[1].toString());
    int maxIteration = Integer.parseInt(args[2].toString());
    for (int i = 0; i < maxIteration; i++) {
        maxArrayList.add(getRandomQuote().toString() + "\n");
        try {
            TimeUnit.SECONDS.sleep(timeDelay);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
    Map<String, Long> counterMap = maxArrayList.stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
    String updateQuoteCount = args[0] + " " + counterMap;
    System.out.println(updateQuoteCount);
    quoteCounter(updateQuoteCount);
    return counterMap;
  }

  public static ArrayList<String> addContent() {
    ArrayList<String> addQuoteArrayList = new ArrayList<>();
    try (Scanner myObj = new Scanner(System.in)) {
        System.out.print("Enter Quote: ");
        String inputQuote = myObj.nextLine();
        try (Scanner myObj2 = new Scanner(System.in)) {
            System.out.print("Enter Author: ");
            String inputAuthor = myObj2.nextLine();
            try (Scanner myObj3 = new Scanner(System.in)) {
                System.out.print("Enter Category: ");
                String inputCategory = myObj3.nextLine();
                String appendContent = inputQuote + "@" + inputAuthor + "@" + inputCategory;
                addQuoteArrayList.add(appendContent);
                try (FileWriter myWriter = new FileWriter("Quotes.txt", true);
                BufferedWriter bw = new BufferedWriter(myWriter);
                PrintWriter pw = new PrintWriter(bw))
                {
                    
                    pw.println(appendContent);
                    System.out.println("Successfully wrote to the file.");
                    
                  } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                  }
            }
        }
    }
    return addQuoteArrayList;
  }

  public static ArrayList<String> modifyContent(ArrayList<String> createdQuotes) {
    createQuotes();
    for (int i = 0; i < createQuotes().size(); i++) {
        System.out.println((i+1) + ".) "+ createQuotes().get(i));
    }
    try (Scanner modifyObj = new Scanner(System.in)) {
        System.out.print("Enter number to modify: ");
        String indexStringModified = modifyObj.nextLine();
        int indexModified = Integer.parseInt(indexStringModified);
        System.out.println(indexModified);
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("Enter Quote: ");
            String inputQuote = myObj.nextLine();
            try (Scanner myObj2 = new Scanner(System.in)) {
                System.out.print("Enter Author: ");
                String inputAuthor = myObj2.nextLine();
                try (Scanner myObj3 = new Scanner(System.in)) {
                    System.out.print("Enter Category: ");
                    String inputCategory = myObj3.nextLine();
                    String appendContent = inputQuote + "@" + inputAuthor + "@" + inputCategory;
                    createdQuotes.add(indexModified-1, appendContent);
                    for (int i = 0; i < createdQuotes.size(); i++) {
                        if(i == 0){
                            try {
                                FileWriter myWriter = new FileWriter("Quotes.txt");
                                myWriter.write(createdQuotes.get(0));
                                myWriter.close();
                                System.out.println("Successfully wrote to the file.");
                              } catch (IOException e) {
                                System.out.println("An error occurred.");
                                e.printStackTrace();
                              }
                        } else {
                            try (FileWriter myWriter = new FileWriter("Quotes.txt", true);
                            BufferedWriter bw = new BufferedWriter(myWriter);
                            PrintWriter pw = new PrintWriter(bw))
                            {
                                
                                pw.println(createdQuotes.get(i));
                                System.out.println("Successfully wrote to the file.");
                            } catch (IOException e) {
                                System.out.println("An error occurred.");
                                e.printStackTrace();
                            }
                        }
                        
                    }
                }
            }
        }
    } catch (NumberFormatException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    return createdQuotes;
}

public static void deleteContent(ArrayList<String> createdQuotes) {
    createQuotes();
    for (int i = 0; i < createQuotes().size(); i++) {
        System.out.println((i+1) + ".) "+ createQuotes().get(i));
    }
    getQuotesFromTextFile();
    try (Scanner modifyObj = new Scanner(System.in)) {
        System.out.print("Enter number to delete: ");
        String indexStringModified = modifyObj.nextLine();
        int indexModified = Integer.parseInt(indexStringModified);
        System.out.println(indexModified);
        System.out.println(createdQuotes.get(indexModified-1));
        createdQuotes.remove(indexModified-1);
        for (int i = 0; i < createdQuotes.size(); i++) {
            if(i == 0){
                try {
                    FileWriter myWriter = new FileWriter("Quotes.txt");
                    myWriter.write(createdQuotes.get(0)+"\n");
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                  } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                  }
            } else {
                try (FileWriter myWriter = new FileWriter("Quotes.txt", true);
                BufferedWriter bw = new BufferedWriter(myWriter);
                PrintWriter pw = new PrintWriter(bw))
                {
                    
                    pw.println(createdQuotes.get(i));
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
        }
    } catch (NumberFormatException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    createQuotes();
    for (int i = 0; i < createQuotes().size(); i++) {
        System.out.println((i+1) + ".) "+ createQuotes().get(i));
    }
    }

    public static void quoteCounter(String updateQuoteCount) {
        try {
            File myObj = new File("quotesCounter.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        try (FileWriter myWriter = new FileWriter("quotesCounter.txt", true);
        BufferedWriter bw = new BufferedWriter(myWriter);
        PrintWriter pw = new PrintWriter(bw))
        {
            
            pw.println(updateQuoteCount);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}



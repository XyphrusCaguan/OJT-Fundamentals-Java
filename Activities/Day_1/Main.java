import java.util.Scanner;

public class Main {
  public static String getUser() {
    System.out.print("Enter username: ");
    Scanner myObj = new Scanner(System.in);

    String userName = myObj.nextLine();
    return userName;
  }
  public static void main(String[] args) {
    System.out.println("Hello World");
    String user = getUser();
    System.out.println("Username is: " + user);
  }
}

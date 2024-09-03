import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int numberOfCookies = 4;
    
    
    System.out.println("Hello world!");
    System.out.println("Please tell me your name: ");
    Scanner in = new Scanner(System.in);
    
    
    String name = in.nextLine();
    System.out.println("hello " + name + " I'm happy you are here\nHere are " + numberOfCookies + " cookies.");
    }
  }

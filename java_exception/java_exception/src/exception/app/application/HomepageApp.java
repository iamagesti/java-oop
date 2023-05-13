package exception.app.application;

import java.util.Scanner;

public class HomepageApp {
public static void Homepage(){
Scanner inputScanner = new Scanner(System.in);

System.out.println("=========Home Page===========");
System.out.println("[1] - Input transaction");
System.out.println("[2] - Master Data");
System.out.println("[0] - Logout");
System.out.println();
System.out.println("Input Next Command (Number): ");
Integer menu = inputScanner.nextInt();

switch(menu){
    case 1:
    System.out.println("Go to Menu Input Transaction");
    break;
    case 2:
    System.out.println("Go to Menu Master Data");
    break;
    case 0:
    System.out.println("Go to Log out");
    break;
}
inputScanner.close();
}
}

import java.util.Scanner;

public class Main {

    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {

        System.out.println("hello world");
        Scanner sc = new Scanner(System.in);

        System.out.println(ANSI_RED + "How big is line?: ");
        int lineSize = sc.nextInt();
        sc.next();

        System.out.println(ANSI_RED + "Enter Line: ");
        String strLine = sc.nextLine();

        Line line = new Line(strLine.split(" "), lineSize);

        System.out.println("friend near?: " + line.isFriendsNear());
        sc.close();
    }
}
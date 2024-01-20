import java.util.Scanner;
public class SimpleProg1 {
    public static void main(String[] args) {
        System.out.println("Hello, player what is your name? ");
        Scanner playerName = new Scanner(System.in);

        String name = playerName.next();
        System.out.println("Hello, " + name);
    }

}

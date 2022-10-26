
import java.util.Scanner;

public class App42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String an = scanner.nextLine();
        int a = Integer.parseInt(an.split(" ")[0]);
        int n = Integer.parseInt(an.split(" ")[1]);
        System.out.println(a*n+"x**"+(n-1));
    }
}
import java.io.*;
public class App3 {
    public static void main(String[] args) throws IOException {
        String[] s =  {"rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep", "monkey", "rooster", "dog", "pig"};
        BufferedReader test = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("輸入年分");
        int text = Integer.parseInt(test.readLine());
        System.out.println(s[text%12-4]);
    }
}

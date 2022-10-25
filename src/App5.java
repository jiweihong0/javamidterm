import java.io.*;
public class App5 {
 
    private static void cal(int b){
        int s=1;
        int x=1;
        while (s<b) { 
            s*=(x+1);
            x+=1;

        }
        System.err.println(x);
    }
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("輸入數字:");
        int textx = Integer.parseInt(reader.readLine());
        cal(textx);
    }
}



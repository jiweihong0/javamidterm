import java.io.*;
public class App9 {
 
    private static void cal(String a,String b){
        if(b.contains(a)){
            System.out.println("yes");
         }
         else{
            System.out.println("no");
         }
        }
    
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("請輸入兩字串：");
        String textx = reader.readLine();
        String texty = reader.readLine();
        cal(textx,texty);
    }

}


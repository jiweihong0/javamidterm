import java.io.*;
import java.util.Arrays;
public class App7 {
 
    private static void cal(String data){
        String split[]  = data.split(","); 
        Arrays.sort(split);
        int min = Integer.parseInt(String.join("", split));
      
        String maxstr="";
        for(int i=split.length-1;i>=0;i--){

        
         maxstr+=split[i];
        }
        int max = Integer.parseInt(String.join("", maxstr));
        System.out.println(max-min);  

        
    
        }
    
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("輸入數字:");
        String textx = reader.readLine();
        cal(textx);
    }

}


import java.io.*;
public class App8 {
 
    private static void cal(String a,String b){
        String[] numstr = b.split(" ");
        String[] nums = new String[numstr.length];
        int total=0;
        for(int i = 0; i < numstr.length; i ++) {
            nums[i] = (numstr[i]);
        }
        for(String n: nums) {
    
            if(n.contains(a)){
                total++;
            }
        }
        System.out.println("最大出現次数的数字為:"+total);
     
    
        
    
        }
    
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("輸入第一行正整數為：");
        String textx = reader.readLine();
        System.out.print("第二行中数列中的数字為：");
        String texty = reader.readLine();
        cal(textx,texty);
    }

}


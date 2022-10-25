import java.io.*;
import java.util.*;
public class App10 {
 
    private static void cal(int n,int m) throws IOException{
        String [][] p;
        p=new String[n][m];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   
        for (int i = 0; i <n; i++) {
            System.out.print("請輸入第"+(i+1)+"列：");
            String a = reader.readLine();
            String[] aIn = a.trim().split(" "); 
            // System.out.println(Arrays.toString(aIn));
            p[i]=aIn;
        }
        String [][] q;
        q=new String[m][n];
        for(int i=0;i<p.length;i++)
        {
            for(int j=0;j<p[i].length;j++)
            {
                q[j][i]=p[i][j];
            }
        }
        for(int j=0;j<q.length;j++)
            {
                System.out.println("输出矩陣數值第1列為："+Arrays.toString(q[j]));  
            }
        }
    
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("請輸入兩字串：");
        String textx = reader.readLine();
        String[] textxIn = textx.trim().split(" "); 
        Arrays.toString(textxIn);
        cal(Integer.parseInt(textxIn[0]),Integer.parseInt(textxIn[1]));
    }
}


import java.util.*;
public class App15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一組四位数字:");
        String data=scanner.nextLine();    
        String[] str = data.trim().split("");
        int [] newstr=new int[str.length];

      
        for (int i = 0; i < str.length; i++) {
            newstr[i] = (Integer.parseInt(str[i])+7)%10;
        }
        System.out.println("解密後的密碼:"+newstr[2]+newstr[3]+newstr[0]+newstr[1]);
    }
}

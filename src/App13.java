import java.util.*;
public class App13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入連續字元：");
        String str=scanner.next();   
        StringBuilder strb = new StringBuilder(str);
        String strr;
		strr = strb.reverse().toString();

        if(strr.contains(strr)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }    
}

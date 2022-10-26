import java.util.*;
public class App19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入：");
        String str=scanner.nextLine();   
        String[] strIn = str.trim().split(" "); 
        int total = 0;
        for (int i = 0; i < strIn.length; i++) {
        if (strIn[i].contains("A")) {
            total += 1; 
        }
        else if (strIn[i].contains("J")){
          total += 11;
        }
        else if (strIn[i].contains("Q")){
          total += 12;
        }
        else if (strIn[i].contains("K")){
          total += 13;
        }
        else{
    
         
          total +=Integer.parseInt(strIn[i]);
        // System.out.println(strIn[i]);
        }
        }
        System.out.println(total);
       
    }
}

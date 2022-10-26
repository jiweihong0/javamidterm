import java.util.*;
public class App22 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("榆入查詢組數N為：");
    int num=scanner.nextInt();   

    Dictionary password = new Hashtable();
    password.put("123","456");
    password.put("456","789");
    password.put("789","888");
    password.put("336","558");
    password.put("775","666");   
    password.put("566","221");   
    Dictionary cash = new Hashtable();
    cash.put("123","9000");
    cash.put("456","5000");
    cash.put("789","6000");
    cash.put("336","10000");
    cash.put("775","12000");   
    cash.put("566","7000");   
    for (int i = 1; i <= num; i++) {
        Scanner scanner2 = new Scanner(System.in);
    
        String str=scanner2.nextLine();
        String[] strIn = str.trim().split(" ");   
        System.out.println(Arrays.asList(strIn));
        if (((String) password.get(strIn[0])).contains(strIn[1])) {
            System.out.println(cash.get(strIn[0])); 
        }
        
        else {
         System.out.println("error");
        }

    }
  
}
}

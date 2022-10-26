import java.util.*;
public class App21 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("請输入一個學號：");
    String str=scanner.nextLine();   

    Dictionary name = new Hashtable();
    name.put("123","Tom");
    name.put("456","Cat");
    name.put("789","Nana");
    name.put("321","Lim");
    name.put("654","Won");   
    Dictionary fac = new Hashtable();
    fac.put("123","DTGD");
    fac.put("456","CSIE");
    fac.put("789","ASIE");
    fac.put("321","DBA");
    fac.put("654","FDD");   
  
    System.out.println("學生資料為："+str+name.get(str)+fac.get(str));
  
}
}

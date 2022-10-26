import java.util.*;
public class App20 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("組數為：");
    int g=scanner.nextInt();   
    for (int i = 1; i <=g; i++) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("第"+i+"組：" );
        int n=scanner2.nextInt();
        int m=scanner2.nextInt(); 
        System.out.println("第"+i+"組應收費用："+(n*250+m*175) );

    }   
   } 
}

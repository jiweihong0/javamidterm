import java.util.*;
public class App12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入月及日：");
        String month=scanner.nextLine();
        String [] aa = month.split(" ");
        
        get_con(aa);
    }
    public static  void get_con(String[] strIn) {
        int lcount=0;
        for (int i = 0; i < strIn.length; i++) {
            int count =0;
            for (int j = 0; j < strIn.length; j++) {
          
               
                if (strIn[i].contains(strIn[j])) {
                   count++;
                }
            }
            System.out.println(count/2);
            if ((count/2)>0.5){
               System.out.println("過半元素為："+strIn[i]);
               lcount =count;
            }
            
            break;
        }
      if (lcount==0){
        System.out.println("過半元素為：NO");
      }
    }
}


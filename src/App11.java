import java.util.*;
public class App11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入月及日：");
        int month=scanner.nextInt();
        int date=scanner.nextInt(); 
       System.out.println(get_con(month,date));
    }
    public static  String get_con(int month, int date){
        int [] dates = {21, 19, 21, 21, 22, 22, 23, 24, 24, 24, 23, 22};
        String[] con ={"摩羯座", "水瓶座", "雙魚座", "牡羊座", "金牛座", "雙子座", "巨蟹座", "獅子座", "處女座", "天秤座", "天蝎座", "射手座"};
        if (date < dates[month-1]) {
            return con[month-1]; 
        }
        else{

            return con[month] ;
        }
    }
}


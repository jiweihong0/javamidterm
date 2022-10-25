import java.io.*; 
public class App2 {
    private static void charge(int a){
        System.out.println(a);
        float nsum = 0, sum = 0;
        for (int i = a; i >= 1; i--){
            if(i<=120){
                sum+=2.1;
                nsum+=2.1;
            }
            else if(i<=330){
                sum+=3.02;
                nsum+=2.68;
            }
            else if(i<=500){
                sum+=4.39;
                nsum+=3.61;
            }
            else if(i<=700){
                sum+=4.97;
                nsum+=4.01;
            }
            else if(i>=701){
                sum+=5.63;
                nsum+=4.5;
            }
        }
        System.out.println("夏季電價"+sum);
        System.out.println("非夏季電價"+nsum);
    } 
    public static void main(String[] args) throws IOException{
        BufferedReader test = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("輸入一些字");
        String text = test.readLine();
        charge(Integer.parseInt(text));
    }
}

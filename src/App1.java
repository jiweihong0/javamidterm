import java.io.*; 
public class App1 {
    public static void main(String[] args) throws IOException {
        BufferedReader test = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("輸入一些字");
        String text = test.readLine();
        String[] temp = text.split("");
        int aa = 0;
        for(int i = 0; i < text.length(); i++) {
            StringBuffer numlist = new StringBuffer("");
            numlist.append(temp[i]);
            int b =  single(Integer.parseInt(numlist.toString()));
            if(b>aa){
                aa = b;
            }
            for (int j = i+1;j< text.length();j++) {
                numlist.append(temp[j]);
                int a =  single(Integer.parseInt(numlist.toString())); 
                if (a>aa) {
                    aa = a;
                }
            }
        }
        if (aa == 0) {
            System.out.println("No prime found ");
        }else{
            System.out.println(aa);
        }
    }
    public static int single(int num){
        if(num>2){
            for (int i = 2; i < num; i++){
                if (num%i == 0){
                    return 0;
                }
            }
            return num;
        }
        else{
            return num;
        }
    } 
}

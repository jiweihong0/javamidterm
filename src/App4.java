import java.io.*;
public class App4 {
    private static void cal(int x, int y){
        if ((x == 0) && (y == 0)) {
            System.out.println("該點位於原點");
        } else if ((x == 0) && (y > 0)) {
            System.out.println(String.format("該點位於上半平面Y軸上，離原點距離為根號%d", (int)Math.pow((double) y, 2.0)));
        } else if (x == 0) {
            System.out.println(String.format("該點位於下半平面Y軸上，離原點距離為根號%d", (int)Math.pow((double) y, 2.0)));
        } else if ((y == 0) && (x > 0)) {
            System.out.println(String.format("該點位於左半平面X軸上，離原點距離為根號%d", (int)Math.pow((double) x, 2.0)));
        } else if (y == 0) {
            System.out.println(String.format("該點位於右半平面X軸上，離原點距離為根號%d", (int)Math.pow((double) x, 2.0)));
        } else if ((x > 0) && (y > 0)) {
            System.out.println(String.format("該點位於第一象限，離原點距離為根號%d", (int)(Math.pow((double) x, 2.0) + Math.pow((double) y, 2.0))));
        } else if (x > 0) {
            System.out.println(String.format("該點位於第四象限，離原點距離為根號%d", (int)(Math.pow((double) x, 2.0) + Math.pow((double) y, 2.0))));
        } else if (y > 0) {
            System.out.println(String.format("該點位於第二象限，離原點距離為根號%d", (int)(Math.pow((double) x, 2.0) + Math.pow((double) y, 2.0))));
        } else {
            System.out.println(String.format("該點位於第三象限，離原點距離為根號%d", (int)(Math.pow((double) x, 2.0) + Math.pow((double) y, 2.0))));
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("輸入X:");
        int textx = Integer.parseInt(reader.readLine());
        System.out.print("輸入Y:");
        int texty = Integer.parseInt(reader.readLine());
        cal(textx, texty);
    }
}

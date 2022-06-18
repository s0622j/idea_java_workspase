package test_02;

import java.util.Scanner;

/**
 * @author shenjie
 * @version 1.0
 */
public class ExTest {
    public static void main(String[] args) {



        while (true){
            try {
                int n = Integer.parseInt(getInt());
                System.out.println("输入的是:" + n);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("输入:" + e.getMessage() + "  有误，请重新输入");
            }
        }

    }



    public static String getInt(){
        System.out.print("输入：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s);
        return s;
    }
}

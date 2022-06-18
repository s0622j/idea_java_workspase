package hsp.chapter05_process;

public class ForExercise02_12 {
    //编写一个main方法
    public static void main(String[] args) {

        //化繁为简
        //先死后活
        int n = 9;
        for( int i = 0; i <= n; i++) {
            System.out.println(i + "+" + (n-i) + "=" + n);
        }
    }
}

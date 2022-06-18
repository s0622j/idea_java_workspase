package hsp.chapter10_oop03.main_02;

public class Hello_00 {
    public static void main(String[] args) {
        //args 是如何传入的
        //遍历显示
        for (int i = 0; i < args.length; i++) {
            System.out.println("第" + (i + 1) + "个参数" + args[i]);
        }
    }
}
// java Hello tom jack smith
package hsp.chapter04_operator;

public class BitOperator02_16 {
    //编写一个main方法
    public static void main(String[] args) {
        System.out.println(1 >> 2); //0
        System.out.println(1 << 2); //4
        System.out.println(4 << 3); // 4 * 2 * 2 * 2 = 32
        System.out.println(15 >> 2); // 15 / 2 / 2 = 3

        System.out.println(-10.4%3); // -1.4近似值
        System.out.println(-10.5%3); // -1.5

        int i=66;
        System.out.println(++i+i); //134
        //System.out.println(i+++i); //133
    }
}

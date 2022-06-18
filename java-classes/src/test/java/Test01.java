public class Test01 {
    public static void main(String[] args) {

        CC c = new CC();
        CC xx1 = c;
        CC xx2 = c;
        System.out.println(c);
        System.out.println(xx1);
        System.out.println(xx2);

        System.out.println("=================================");
        c.isJ(1);
        System.out.println(c.isJ(2));

        c.P(5,7,'*');

        System.out.println(c.jC(5));
        System.out.println(c.fB(10));
        System.out.println(c.peach(1));

    }
}

class  CC {

    public boolean isJ (int a){
        return a % 2 != 0;
    }

    public void P (int a , int b ,char c){

        for (int i = 0 ; i < a ; i++){
            for (int j = 0 ; j < b ; j++){
                System.out.print(c);
            }
            System.out.println();
        }

    }

    //阶乘
    public int jC (int a){
        if( a == 1){
            return a;
        } else {
            return jC(a - 1) * a;
        }
    }


    /*
    		请使用递归的方式求出斐波那契数1,1,2,3,5,8,13...给你一个整数列n，求出它的值是多
		思路分析
		1. 当n = 1 斐波那契数 是1
		2. 当n = 2 斐波那契数 是1
		3. 当n >= 3  斐波那契数 是前两个数的和
		4. 这里就是一个递归的思路
     */

    public long fB(int a){
        if (a == 1 || a == 2){
            return 1;
        } else if (a > 0){
            return fB(a-2) + fB(a - 1);
        } else { return -1 ;}
    }



    /*
        猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
    以后每天猴子都吃其中的一半，然后再多吃一个。当到第10天时，
    想再吃时（即还没吃），发现只有1个桃子了。问题：最初共多少个桃子？

    思路分析 逆推
    1. day = 10 时 有 1个桃子
    2. day = 9 时  有 (day10 + 1) * 2 = 4
    3. day = 8 时  有 (day9 + 1) * 2 = 10
    4. 规律就是  前一天的桃子 = (后一天的桃子 + 1) *2//就是我们的能力
    5. 递归
     */
    public int peach (int day){
        if(day == 10){
            return 1;
        } else if (day > 0 && day < 10){
            return (peach(day + 1) + 1) * 2;
        } else { return -1; }
    }

}
package hsp.chapter13_CommonClass.string_02;

/**
 * @author shenjie
 * @version 1.0
 */
public class StringExercise10_08 {
    public static void main(String[] args) {
        String str = new String("hsp");
         char[] ch = {'j', 'a', 'v', 'a'};
        int[] i = {1,2,3,4,5,6,7};
        System.out.println(ch);
        System.out.println(i);

    }
}

class Test1 {
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};

    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
    }

    public static void main(String[] args) {
        Test1 ex = new Test1();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);
    }
}
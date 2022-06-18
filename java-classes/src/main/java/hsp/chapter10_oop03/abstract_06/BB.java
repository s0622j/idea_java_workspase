package hsp.chapter10_oop03.abstract_06;

public class BB extends Template {
    public void job() {//这里也去，重写了Template的job方法

        long num = 0;
        for (long i = 1; i <= 8000000; i++) {
            num *= i;
        }

    }
}

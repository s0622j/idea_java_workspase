package hsp.chapter10_oop03.abstract_06;

public class TestTemplate_05 {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.calculateTime(); //这里还是需要有良好的OOP基础，对多态

        BB bb = new BB();
        bb.calculateTime();
    }
}

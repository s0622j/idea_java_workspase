package test_02.H10;

public class H10 {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("jack", 11, "D", 'M', 10000);
        Doctor d2 = new Doctor("jack", 12, "D", 'M', 10000);
        System.out.println(d1.equals(d2));
    }
}

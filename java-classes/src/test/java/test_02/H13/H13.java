package test_02.H13;

public class H13 {
    public static void main(String[] args) {
        Student s1 = new Student("小明", '男', 16, 20);
        Student s2 = new Student("小红", '女', 15, 30);

        Teacher t1 = new Teacher("大刚", '男', 33, 5);
        Teacher t2 = new Teacher("老李", '男', 52, 28);

        s1.show();
        System.out.println("------------------------------");
        s2.show();
        System.out.println("------------------------------");
        t1.show();
        System.out.println("------------------------------");
        t2.show();
        System.out.println("------------------------------");

        Person[] arr = {s1, s2, t1, t2};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + ":" + arr[i].getAge());
        }

        System.out.println("------------------------------");
        System.out.println("------------------------------");
        sortPer(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + ":" + arr[i].getAge());
        }
        System.out.println("*******************************");
        H13 h13 = new H13();
        h13.diao(t1);
        h13.diao(s1);
    }




    public static void sortPer(Person[] p){
        Person tmp;
        for (int i = 1 ; i < p.length ; i++){
            for (int j = 0 ; j < p.length - i ; j++){
                if (p[j].getAge() < p[j+1].getAge()){
                    tmp = p[j+1];
                    p[j+1] = p[j];
                    p[j] = tmp;
                }

            }
        }
    }

    public  void diao(Person p){
        if (p instanceof Teacher){
            ((Teacher) p).teach();
        } else if (p instanceof Student){
            ((Student) p).study();
        } else {
            System.out.println("参数类型不对！！");
        }
    }
}

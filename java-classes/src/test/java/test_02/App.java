package test_02;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("jack", 12, "web");
        Person p2 = new Person("tom", 10, "sql");
        Person p3 = new Person("smith", 17, "java");

        Person[] arr = {p1,p2,p3};
        for (int i = 0 ; i<arr.length ;i++){
            System.out.println("name:"+arr[i].getName() + "\tage:" + arr[i].getAge() + "\tjob"+ arr[i].getJob());
        }

        System.out.println("================================");

        for (int i = 1 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr.length - i ; j++){
                Person max = arr[j];
                if(arr[j].getAge() > arr[j+1].getAge()){
                    arr[j] = arr[j+1];
                    arr[j+1] = max;
                }
            }
        }

        for (int i = 0 ; i<arr.length ;i++){
            System.out.println("name:"+arr[i].getName() + "\tage:" + arr[i].getAge() + "\tjob"+ arr[i].getJob());
        }



    }
}

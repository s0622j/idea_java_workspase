public class Eq {
    public static void main(String[] args) {
        Person p1 = new Person("小明", 12, '男');
        Person p2 = new Person("小明", 1, '男');

        System.out.println(p1.equals(p2));
    }

}


class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


//    public boolean equals(Person obj) {
//       if(this.name.equals(obj.name) && this.age == obj.age && this.gender == obj.gender) {
//           return true;
//       } else {return false;}
//    }


    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Person){
           return  ((Person) obj).name.equals(this.name) && ((Person) obj).age == this.age && ((Person) obj).gender == this.gender;
        } else {
        return false;
        }
    }
}
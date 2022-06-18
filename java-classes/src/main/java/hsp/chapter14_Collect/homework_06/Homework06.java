package hsp.chapter14_Collect.homework_06;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author shenjie
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework06 {
    public static void main(String[] args) {
        HashSet set = new HashSet();//ok
        Person02 p1 = new Person02(1001,"AA");//ok
        Person02 p2 = new Person02(1002,"BB");//ok
        set.add(p1);//ok
        set.add(p2);//ok
        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);//2
        set.add(new Person02(1001, "CC"));
        System.out.println(set);//3
        set.add(new Person02(1001,"AA"));
        System.out.println(set);//4

    }
}

class Person02 {
    public String name;
    public int id;

    public Person02(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person02 person = (Person02) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
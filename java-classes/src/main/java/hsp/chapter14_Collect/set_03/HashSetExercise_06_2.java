package hsp.chapter14_Collect.set_03;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author shenjie
 * @version 1.0
 */
public class HashSetExercise_06_2 {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add(new Emp("milan", 18.5 ,new MyDate(2022,1,10)));//ok
        hashSet.add(new Emp("milan", 16.5 ,new MyDate(2022,1,10)));//ok
        hashSet.add(new Emp("milan", 12.5 ,new MyDate(2022,1,10)));//加入不成功.

        //回答,加入了几个? 3个
        System.out.println("hashSet=" + hashSet);

    }
}

class Emp{
    private String name;
    private Double sal;
    private MyDate birthday;

    public Emp(String name, Double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(name, emp.name) &&
//                Objects.equals(sal, emp.sal) &&
                Objects.equals(birthday, emp.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,  birthday);
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year &&
                month == myDate.month &&
                day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}

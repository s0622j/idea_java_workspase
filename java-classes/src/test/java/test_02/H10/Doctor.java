package test_02.H10;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        } else if(obj instanceof Doctor){
            if (((Doctor) obj).name.equals(this.name) && ((Doctor) obj).age == this.age
            && ((Doctor) obj).gender == this.gender && ((Doctor) obj).job.equals(this.job)
            && ((Doctor) obj).sal == this.sal){
                return  true;
            } else {
                return false;
            }

        } else {
            return false;
        }

    }
}

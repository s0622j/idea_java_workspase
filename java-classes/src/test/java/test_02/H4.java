package test_02;

class H4 {
    public static void main(String[] args) {

        m jack = new m("jack", 3000D, 20, 1.2, 1000D);
        jack.print();

    }
}

class Emp {
    private String name;
    private Double sal;
    private int days;
    private Double level;
    private Double j;

    public Emp(String name, Double sal, int days, Double level, Double j) {
        this.name = name;
        this.sal = sal;
        this.days = days;
        this.level = level;
        this.j = j;
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

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }


    public Double getLevel() {
        return level;
    }

    public void setLevel(Double level) {
        this.level = level;
    }

    public Double getJ() {
        return j;
    }

    public void setJ(Double j) {
        this.j = j;
    }

    public void print() {
        System.out.println("name:" + name + "\tsal:"
                + sal + "\tdays:" + days + "\tlevel:" + level + "\tj:" + j
                + "\t总工资:" + (sal * days * level + j));
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", days=" + days +
                ", level=" + level +
                ", j=" + j +
                '}';
    }
}

class m extends Emp {
    public m(String name, Double sal, int days, Double level, Double j) {
        super(name, sal, days, level, j);
    }

    @Override
    public void print() {
        super.print();
    }
}

class e extends Emp {
    public e(String name, Double sal, int days, Double level, Double j) {
        super(name, sal, days, level, j);
    }

    @Override
    public void print() {
        super.print();
    }
}
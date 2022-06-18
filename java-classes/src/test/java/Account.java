public class Account {
    private String name;
    private double yue;
    private String passWd;

    public Account() {
    }

    public Account(String name, double yue, String passWd) {
//        this.name = name;
//        this.yue = yue;
//        this.passWd = passWd;
        setName(name);
        setPassWd(passWd);
        setYue(yue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() > 1 && name.length() < 5) {

            this.name = name;
        } else {
            System.out.println("名字不符合--赋默认值小明");
            this.name = "小明";
        }
    }

    public double getYue() {
        return yue;
    }

    public void setYue(double yue) {
        if (yue > 20) {

            this.yue = yue;
        } else {
            System.out.println("没有足够的金币");
            this.yue = 0;
        }
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        if (passWd.length() == 6) {

            this.passWd = passWd;
        } else {
            System.out.println("密码格式不对，赋123456");
            this.passWd = "123456";
        }
    }
}

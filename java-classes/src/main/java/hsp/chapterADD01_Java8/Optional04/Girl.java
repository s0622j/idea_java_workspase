package hsp.chapterADD01_Java8.Optional04;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName Girl.java
 * @Description TODO
 * @createTime 2022-05-26 23:18:00
 */
public class Girl {
    private String name;

    public Girl() {
    }

    public Girl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                '}';
    }
}

package hsp.chapterADD01_Java8.Optional04;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName Boy.java
 * @Description TODO
 * @createTime 2022-05-26 23:17:00
 */
public class Boy {
    private Girl girl;

    public Boy() {
    }

    public Boy(Girl girl) {
        this.girl = girl;
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "girl=" + girl +
                '}';
    }
}

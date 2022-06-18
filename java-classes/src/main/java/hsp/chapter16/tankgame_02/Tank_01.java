package hsp.chapter16.tankgame_02;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName Tank_01.java
 * @Description TODO
 * @createTime 2022-04-02 09:26:00
 */
public class Tank_01 {
    private int x;//坦克的横坐标
    private int y;//坦克的纵坐标

    public Tank_01(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

package hsp.chapter16.tankgame_02_04;

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
    private int speed = 1;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //上右下左移动方法
    public void moveUp() {
        y -= speed;
    }
    public void moveRight() {
        x += speed;
    }
    public void moveDown() {
        y += speed;
    }
    public void moveLeft() {
        x -= speed;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    private int direct = 0;//坦克方向 0 上1 右 2下 3左

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

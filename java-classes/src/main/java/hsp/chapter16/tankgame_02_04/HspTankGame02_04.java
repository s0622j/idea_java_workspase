package hsp.chapter16.tankgame_02_04;

import javax.swing.*;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName HspTankGame01_04.java
 * @Description TODO
 * @createTime 2022-04-02 10:05:00
 */
public class HspTankGame02_04 extends JFrame {
    //定义MyPanel
    MyPanel_03 mp = null;
    public static void main(String[] args) {
        HspTankGame02_04 hspTankGame01_04 = new HspTankGame02_04();
    }

    public HspTankGame02_04(){
        mp = new MyPanel_03();
        this.add(mp);//把面板(就是游戏的绘图区域)
        this.setSize(1000,750);
        this.addKeyListener(mp);//让JFrame 监听mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

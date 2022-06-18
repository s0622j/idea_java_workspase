package hsp.chapter17_Thread;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName CpuNum.java
 * @Description TODO
 * @createTime 2022-04-02 15:45:00
 */
public class CpuNum {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑的cpu数量/核心数
        int cpuNums = runtime.availableProcessors();
        System.out.println("当前有cpu 个数=" + cpuNums);


    }
}

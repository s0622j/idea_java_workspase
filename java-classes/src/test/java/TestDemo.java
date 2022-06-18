import org.junit.Test;

import java.util.Scanner;

public class TestDemo {

    public static void main (String[] args){

        String str = "";

        System.out.println("-----");
        System.out.println("-----:" + str.length());

        Scanner s = new Scanner(System.in);
        System.out.println("输入------------");
        int g = s.nextInt();
        if(g == 100) {
            System.out.println("good");
        } else if (g > 80 && g <= 90){
            System.out.println("nice");
        } else if (g >= 60 && g <= 80) {
            System.out.println("一般");
        } else {
            System.out.println("bad");
        }

    }

    @Test
    public void Demo2(){
        boolean a = true;
        //if (a = false)
        if (a == false)
            System.out.println("a");
        else if (a)
            System.out.println("b");
        else if (!a)
            System.out.println("c");
        else
            System.out.println("d");
    }

    @Test
    public void Demo3(){
        int i = 0;
        int j = 0;
        for(i = 1 ; i <= 9 ; i++){
            for ( j = i ; j <= 9; j++){
                System.out.println( i + " * " + j + " = " + i * j);
            }
        }
    }

    @Test
    public void Demo4(){
        int i = 0;
        int j = 0;
        for(i = 1 ; i <= 9 ; i++){
            for ( j = 1 ; j <= i; j++){
                System.out.print( j + " * " + i + " = " + j * i + "\t");
            }
            System.out.println("");
        }
    }

    @Test
    public void Demo05(){
        double s = 100000;
        int i = 0;
        int con = 0;

        for (i = 1 ; s >= 0 ; i++ ){
            if (s > 50000){
                s = s - s*0.05;
                con = con + 1;
            } else {
                s = s - 1000;
                con += 1;
            }
        }
        System.out.println("con:" + (con - 1));
    }

    @Test
    public void Demo06(){
        double s = 100000;
        int i = 0;
        int con = 0;

        while (true){
            if (s > 50000){
                s = s - s*0.05;
                con = con + 1;
            } else if( s>0 && s <= 50000) {
                s = s - 1000;
                con += 1;
            } else { break ;}
        }
        System.out.println("con:" + (con-1));
    }

    @Test
    public void Demo07(){
        char s = 'a';
        char S = 'A';
        int i = 0;
        for(i = 0 ; i <= 25 ; i++){
            System.out.print((char) (s + i));
        }
        System.out.println("==================");
        for(i = 0 ; i <= 25 ; i++){
            System.out.print((char) (S + i));
        }
    }

    @Test
    public void Demo08(){

        int sum = 0;
        for(int i = 1 ; i <= 100 ; i++){
            for(int j = 1 ; j <= i ; j++){
                sum += j;
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("sum:"+sum);
    }

    @Test
    public void Demo09(){

        int[] arr1 = {1,2,3};
        int[] arr2 = new int[arr1.length + 1 ];

        for(int i = 0 ; i <= arr1.length ; i++){
            if(i != arr1.length){
                arr2[i] = arr1[i];
            } else {
                arr2[i] = 4;
            }
        }

        arr1 = arr2;

        for (int i = 0 ; i < arr1.length ; i++){
            System.out.println("arr1[" + i +"]=" + arr1[i]);
        }

    }


    @Test
    public void Demo10(){

        int[] arr01 = {24,69,80,57,13,66,88,90,34,63,243,888,666,8888};

        for(int i = 1 ; i < arr01.length ; i++){
            for(int j = 0 ; j < arr01.length - i ; j++){
                int temp = 0;
                if(arr01[j] > arr01[j+1]) {
                    temp = arr01[j+1];
                    arr01[j+1] = arr01[j];
                    arr01[j] = temp;
                }
            }
        }

        for(int i = 0 ; i < arr01.length ; i++){
            System.out.println("arr01[" + i + "]=" + arr01[i]);
        }
    }




    @Test
    public void Demo11(){

        int[] arr1 = {10, 12, 45, 90};
        int insert = -110;
        int[] arr2 = new int[arr1.length + 1];
        int flag = -1;

        for(int i = 0 ; i < arr1.length ; i++){
            if(insert < arr1[i]){
                flag = i;
                break;
            } else {
                flag = arr1.length;
            }
        }

        for (int j = 0 ; j < arr2.length ; j++){
            if (j < flag){
                arr2[j] = arr1[j];
            } else  if (j == flag) {
                arr2[j] = insert;
            } else {
                arr2[j] = arr1[j-1];
            }
        }

        for (int i = 0 ; i < arr2.length ; i++){
            System.out.println("arr2[" + i + "]=" + arr2[i]);
        }
    }



    @Test
    public void Demo12(){

        int[] arr1 = new int[10];

        //int a = (int)(Math.random()*100) + 1;

        for (int i = 0 ; i < arr1.length ; i++){
            arr1[i] = (int)(Math.random()*10) + 1;
        }


        System.out.println("==========分割线===========");
        for(int i = 0 ; i < arr1.length ; i++){
            System.out.println(arr1[i] + "\t");
        }

        double sum = 0;
        int max = arr1[0];
        int maxi = 0;
        String a8 = "没8";
        for(int i = 0 ; i < arr1.length ;++i){
            sum += arr1[i];
            if(max < arr1[i]){
                max = arr1[i];
                maxi = i;
            }

            if(arr1[i] == 8){
                a8 = "有8！！！！！！";
            }

        }
        System.out.println("max="+ max + "   i=" + maxi  + "\tsum=" + sum/arr1.length + "\n8有木有：" + a8);
    }



    @Test
    public void Demo13(){

        int[] arr01 = {24,69,80,57,13,66,88,90,34,63,243,888,666,8888};
        int temp;

        for(int i = 1 ; i < arr01.length ; i++){
            for (int j = 0 ; j < arr01.length - i ; j++){
                if(arr01[j] < arr01[j+1]){
                    temp = arr01[j];
                    arr01[j] = arr01[j+1];
                    arr01[j+1] = temp;
                }
            }
        }

        for(int i = 0 ; i < arr01.length ; i++){
            System.out.print(arr01[i] + "\t");
        }
    }

    @Test
    public void D11(){
        int a = 10;
        int b = 3;
        double res = a*1.0 / b;
        System.out.println(res);
        System.out.println(10/3);
    }


}

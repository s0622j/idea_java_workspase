public class H07 {
    public static void main(String[] args) {

        TestH07 t = new TestH07(10);

        double[] a = {2.3,5.7,4,7,8,8.9};
        System.out.println(t.maxD(a));

        String[] str = {"aa","abc","aa","bcdeg","dca"};
        System.out.println("in::" + t.find(str,"aa"));

        System.out.println("价格是：" + t.pri);

        double[] xx = t.copyArr(a);
        for (int i = 0 ; i < xx.length ;i++){
            System.out.print(xx[i] + "\t");
        }

        System.out.println("周长" + t.zc(5));
        System.out.println("面积" + t.area(5));

    }


}


class TestH07{
    double pri;

    public double maxD(double[] arr){
        double m = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if (m < arr[i]){
                m = arr[i];
            }
        }
        return m;
    }

    public int find(String[] arr,String s){
        int index = -1;
        for (int i = 0 ; i < arr.length ; i++){
            if (s == arr[i]){
                System.out.println("====index:" + i);
                index = i;
                 break;
            }

        }
        return index;
    }


    TestH07(double pri){
        if (pri>150){
            this.pri = 150;
        } else if (pri > 100) {
            this.pri = 100;
        } else if (pri >= 0){
            this.pri = pri;
        } else {
            this.pri = -1;
        }
    }


    public double[] copyArr(double[] arr){
        double[] cp = new double[arr.length];
        for (int i = 0 ; i < arr.length ;i++){
            cp[i] = arr[i];
        }
        return cp;
    }


    public double zc(double r){
        return 2*3.14*r;
    }

    public double area(double r){
        return 3.14*r*r;
    }
}


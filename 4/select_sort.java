/*************************************************************************
	> File Name: select_sort.java
	> Author:
	> Mail:
	> Created Time: 2016年09月23日 星期五 08时41分21秒
 ************************************************************************/
import java.util.Random;
import java.util.Arrays;
public class select_sort {
    public static void sel_so(double[] list) {
        double MaxNumber;
        int MaxInode;
        for(int i = 0; i < list.length; i++) {
            MaxNumber = list[0];
            MaxInode = 0;
            for(int j = 0; j < list.length - i - 1; j++) {
                if(list[j] > MaxNumber) {
                    MaxNumber = list[j];
                    MaxInode = j;
                }
            }
            double tmp;
            if(MaxInode != list.length - i -1) {
                tmp = list[list.length - 1 - i];
                list[list.length - 1 - i] = list[MaxInode];
                list[MaxInode] = tmp;
            }
        }
    }
    public static void display(double[] list) {
        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void main(String args[]) {
        Random ra = new Random();
        double[] list = new double[10];
        for(int i = 0; i < list.length; i++) {
            list[i] = ra.nextDouble();
        }
        sel_so(list);
//        display(list);
        Arrays.sort(list);
//        System.out.println();
        display(list);

    }
}

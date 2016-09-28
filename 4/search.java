/*************************************************************************
	> File Name: search.java
	> Author:
	> Mail:
	> Created Time: 2016年09月21日 星期三 14时41分25秒
 ************************************************************************/
import java.util.Random;
import java.util.Arrays;

public class search {

    public static int linearSearch(int[] list,int key) {
        for(int i = 0; i < list.length; i++) {
            if(key == list[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] list,int key) {
        int low = 0;
        int high = list.length - 1;

        while(high >= low) {
            int mid = (low + high) / 2;
            if(key < list[mid])
                high = mid - 1;
            else if(key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -low - 1;
    }

    public static void main(String args[]) {
        int[] test = new int[100000];
        int key;
        Random ra = new Random(47);
        /*        for(int a:test)
                    a = ra.nextInt();
        */
        for(int i = 0; i < test.length; i++) {
            test[i] = ra.nextInt();
        }
        Arrays.sort(test);
        /*        for(int a:test)
                    System.out.print(a);
        */
        key = ra.nextInt();
        long StartTime = System.nanoTime();
        search.linearSearch(test,key);
        long EndTime1 = System.nanoTime();
        search.binarySearch(test,key);
        long EndTime2 = System.nanoTime();
        System.out.println("linear search:" + (EndTime1 - StartTime) + "\nbinarySearch:" + (EndTime2 - EndTime1));
    }
}

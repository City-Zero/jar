/*************************************************************************
	> File Name: equal.java
	> Author: 
	> Mail: 
	> Created Time: 2016年09月23日 星期五 08时29分03秒
 ************************************************************************/
import java.util.Scanner;

public class equal
{
    public static boolean equal(int [] list1,int [] list2){
        if(list1.length == list2.length){
            for(int i = 0;i < list1.length;i++){
                if(list1[i] != list2[i])
                    return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list1:");
        a = sc.nextInt();
        int[] list1 = new int[a];
        for(int i = 0;i < a;i++){
            list1[i] = sc.nextInt();
        }
        System.out.print("Enter list2:");
        a = sc.nextInt();
        int[] list2 = new int[a];
        for(int i = 0;i < a;i++){
            list2[i] = sc.nextInt();
        }

        System.out.println(equal(list1,list2));
    }

}

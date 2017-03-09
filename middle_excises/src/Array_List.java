import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lyt on 16-12-11.
 */
public class Array_List {
    public static void main(String []args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for(int i =0;i< 20;i++){
            al.add(sc.nextInt());
        }
        System.out.println(al);
    }
}

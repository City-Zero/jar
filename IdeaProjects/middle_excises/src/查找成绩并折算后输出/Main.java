package 查找成绩并折算后输出;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by lyt on 17-1-5.
 */
public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        HashMap<String,Double> hp = new HashMap<String,Double>();
        String name;
        double mark;
        name = sc.next();
        while(!name.equals("noname")){
            mark = sc.nextDouble();
            hp.put(name,mark);
            name = sc.next();
        }
        name = sc.next();
        if(hp.get(name) != null){
            System.out.println(hp.get(name) * 0.21);
        }else{
            System.out.println("Not found.");
        }
    }
}

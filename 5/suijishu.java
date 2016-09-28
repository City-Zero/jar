/*************************************************************************
	> File Name: suijishu.java
	> Author:
	> Mail:
	> Created Time: 2016年09月28日 星期三 20时03分00秒
 ************************************************************************/
import java.util.Random;
public class suijishu
{
    public static void main(String[] args){
        Random ra = new Random(1000);
        for(int i = 0;i < 50;i++){
            System.out.print(ra.nextInt(100) + " ");
        }
    }
}


/*************************************************************************
	> File Name: divisible.java
	> Author:
	> Mail:
	> Created Time: 2016年10月13日 星期四 21时47分54秒
 ************************************************************************/
import java.math.BigInteger;
public class divisible {
    public static void main(String []args) {
        BigInteger n = new BigInteger(new String(Long.MAX_VALUE + ""));
        System.out.println(Long.MAX_VALUE);
        int j = 0;
        for(; j < 10; n = n.subtract(new BigInteger(-1 + ""))) {
            if(n.intValue() % 5 ==0 || n.intValue() % 6 == 0) {
                System.out.println(n);
                j++;
            }
        }
    }
}

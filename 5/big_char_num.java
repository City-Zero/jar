/*************************************************************************
	> File Name: big_char_num.java
	> Author:
	> Mail:
	> Created Time: 2016年09月28日 星期三 21时05分37秒
 ************************************************************************/

public class big_char_num {
    public static void main(String[] args) {
        String s = new String(args[0]);
        int n = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= s.charAt(i) && s.charAt(i) <= 'Z') {
                n++;
            }
        }
        System.out.println(n);
    }
}

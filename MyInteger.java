/*************************************************************************
	> File Name: MyInteger.java
	> Author:
	> Mail:
	> Created Time: 2016年09月18日 星期日 09时20分39秒
 ************************************************************************/

public class MyInteger {
    int value;

    MyInteger(int a) {
        this.value = a;
    }

    int get_int() {
        return this.value;
    }

    boolean isEVEN() {
        if(this.value % 2 == 0) {
            return true;
        } else return false;
    }
    boolean isODD() {
        if(this.value % 2 == 1) {
            return true;
        } else return false;
    }
    boolean isPrime() {
        int i;
        for(i=2; i<this.value; i++) {
            if(this.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isEVEN(int a) {
        if(a % 2 == 0) {
            return true;
        } else return false;
    }
    static boolean isODD(int a) {
        if(a % 2 == 1) {
            return true;
        } else return false;
    }
    static boolean isPrime(int a) {
        int i;
        for(i=2; i<a; i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isEVEN(MyInteger a) {
        if(a.value % 2 == 0) {
            return true;
        } else return false;
    }
    static boolean isODD(MyInteger a) {
        if(a.value % 2 == 1) {
            return true;
        } else return false;
    }
    static boolean isPrime(MyInteger a) {
        int i;
        for(i=2; i<a.value; i++) {
            if(a.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int parseInt(char a[]) {
        int s=0;
        int i;
        for(i=0; i<a.length; i++) {
            s += (a[i] - 48) * Math.pow(10,a.length-i-1);
        }
        return s;
    }

    static int parseInt(String a) {
        int s=0;
        int i;
        for(i=0; i<a.length(); i++) {
            s += (a.charAt(i)-48) * Math.pow(10,a.length()-i-1);
        }
        return s; 
    }
    
    public static void main(String args[]){
        MyInteger a = new MyInteger(10);
        System.out.println(a.get_int());

        System.out.println(a.isODD());

        System.out.println(parseInt("1022"));
    }
}

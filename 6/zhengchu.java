public class zhengchu{
    public static void main(String []args){
        int i=1;
        int j=0;
        int size=10;
        int []a=new int [size];
        while(i % 5 == 0 || i % 6 ==0 && j<size ){
            a[j]=i;
            j++;
            i++;
        }
        for(i=0;i<10;i++)
            System.out.print(a[i]);
    }
}

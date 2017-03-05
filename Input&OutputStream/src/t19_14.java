import java.io.*;
import java.util.Scanner;

/**
 * Created by lyt on 16-12-14.
 */
public class t19_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input file name:");
        String Old_name = new String(sc.next());
        try{
            DataInputStream input = new DataInputStream(new FileInputStream(Old_name));
            System.out.print("Please input new file name:");
            String New_name = new String(sc.next());
            DataOutputStream output = new DataOutputStream(new FileOutputStream(New_name));
            char ch;
            while((ch = input.readChar())!= -1){
                ch += 5;
                output.writeChar(ch);
            }
            System.out.print("123");
            input.close();
            output.close();
            sc.close();
        }catch(FileNotFoundException ex){
            System.err.println(ex);
        }catch (IOException ex) {
            System.out.println(ex);
        }

    }
}

package MODULE_4;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        String str1="Hello";
        System.out.println("concated string: "+str1.concat(str));
        System.out.println(" unaltered original string :"+str);

    }
}

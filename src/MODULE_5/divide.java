package MODULE_5;

import java.util.Scanner;
public class divide {
    static void divide(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("invalid denominator");
        }
        else{
            System.out.println(a/b);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            divide(a, b);
        }
        catch (ArithmeticException e){
            System.out.println("caught exception:"+e.getMessage());
        }
        finally{
            System.out.println("program executed");
        }

    }
}


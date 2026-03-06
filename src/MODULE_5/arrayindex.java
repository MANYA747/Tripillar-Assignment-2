package MODULE_5;

import java.util.Scanner;
public class arrayindex {
    static void fetchelement(int [] arr,int index)throws ArrayIndexOutOfBoundsException{
        if (index<0 || index>=arr.length){
            throw new ArrayIndexOutOfBoundsException("Index out of bound");  //throw always used within throw block
        }
        else {
            System.out.println(arr[index]);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int [] arr=new int[n];//array declaration
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter an index:");
        int index=sc.nextInt();
        try{
            fetchelement(arr,index);
        } catch (ArrayIndexOutOfBoundsException e) { //e stores the message given in line 6
            System.out.println("caught exception:"+e.getMessage());
        }
        finally{
            System.out.println("program executed");
        }
    }
}


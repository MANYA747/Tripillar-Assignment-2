package MODULE_4;

public class garbage {
    public static void main(String[] args) {
        garbage c=new garbage();
        c=null;
        System.gc();
        System.out.println("GC requested");
    }
}

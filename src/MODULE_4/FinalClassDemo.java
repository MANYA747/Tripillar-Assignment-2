package MODULE_4;

final class Animal {
    void display() {
        System.out.println("This is a final class");
    }
}

// This class will cause an error
//class Dog extends Animal {
    // Cannot inherit from final class
//}


public class FinalClassDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.display();
    }
}

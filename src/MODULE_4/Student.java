package MODULE_4;

public class Student {

        static String college = "VTU";   // static variable
        int id;
        String name;

        Student(int i, String n) {
            id = i;
            name = n;
        }

        static void displayCollege() {   // static method
            System.out.println("College: " + college);
        }

        void display() {
            System.out.println(id + " " + name + " " + college);
        }

        public static void main(String[] args) {
            Student s1 = new Student(1, "Ram");
            Student s2 = new Student(2, "Sam");

            Student.displayCollege();  // calling static method

            s1.display();
            s2.display();
        }
    }


package MODULE_10;


    class Node {
        int data;
        Node1 next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

public class q1 {
        Node1 head = null;

        // Insert at end
        void add(int data) {
            Node1 newNode = new Node1(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node1 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Display list
        void display() {
            Node1 temp = head;

            if (temp == null) {
                System.out.println("List is empty");
                return;
            }

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }

        public static void main(String[] args) {
            q1 list = new q1();

            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);

            System.out.println("Linked List Elements:");
            list.display();
        }
    }


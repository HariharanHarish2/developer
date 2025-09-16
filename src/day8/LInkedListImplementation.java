package day8;

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class LInkedListImplementation {

    Node head;

    // insertAtBegining
    public void insertAtBegining(int val) {
        Node newNode = new Node(val);
        // works whether head is null or not
        newNode.next = head;
        head = newNode;
    }

    // deleteAtBegining
    public void deleteAtBegining() {
        if (head == null) {
            System.out.println("List is Empty..");
        } else {
            head = head.next;
        }
    }

    // deleteAtEnd
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty..");
        } else if (head.next == null) {
            // only one node in list
            head = null;
        } else {
            Node curr = head;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            curr.next = null;
        }
    }

    public boolean search(Node head, int target) {
        if (head == null) {
            System.out.println("List is Empty....");
            return false;
        } else {
            Node curr = head;
            while (curr != null) {
                if (target == curr.data) {
                    return true;
                }
                curr = curr.next;
            }
            return false;
        }
    }
    //size
    public int size() {
    	int count = 0;
    	Node curr = head;
    	while (curr != null) {
    		count++;
    		curr = curr.next;
    	}
    	return count;
    }

    public void addNode(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    // traversal the node-----
    public void traverse() {
        if (head == null) {
            System.out.print("list is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LInkedListImplementation Linkedlist = new LInkedListImplementation();
        Linkedlist.addNode(25);
        Linkedlist.addNode(35);
        Linkedlist.addNode(45);
        Linkedlist.addNode(65);
        Linkedlist.addNode(55);
        Linkedlist.traverse();
        Linkedlist.insertAtBegining(5);
        System.out.println();
        Linkedlist.traverse();
        Linkedlist.deleteAtBegining();
        System.out.println();
        Linkedlist.traverse();
        Linkedlist.deleteAtEnd();
        System.out.println();
        Linkedlist.traverse();

        // quick search demo
        System.out.println();
        System.out.println("Search 45: " + Linkedlist.search(Linkedlist.head, 45));
        System.out.println("Search 100: " + Linkedlist.search(Linkedlist.head, 100));
        System.out.println("count of list:" + Linkedlist.size());
    }
}

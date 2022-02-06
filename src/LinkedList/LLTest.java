//Singal Linked List


public class LLTest
{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtHead("R");
        list.insertAtHead("A");
        list.insertAtHead("V");
        list.insertAtHead("I");
        list.insertAtHead("D");

        System.out.println(list);
        System.out.println("Length : "+list.length());
        list.insetAtTail("T");
        System.out.println(list);
        System.out.println("Length : "+list.length());
//        list.deleteAtHead();
//        System.out.println(list);
//        System.out.println("Length : "+list.length());
//        System.out.println(list.search("Abir"));
//        System.out.println(list.search("XYZ"));

    }
}


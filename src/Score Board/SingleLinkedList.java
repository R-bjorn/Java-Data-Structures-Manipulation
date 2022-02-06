public class SingleLinkedList {
    private Node head;

    public void insertAtHead(String data){
        Node newNode = new Node(data);
        newNode.setNext(this.head);
        head = newNode;
    }

    public String toString(){
        String result = "{";
        Node current = this.head;

        while(current != null){
            result += current.toString();
            current = current.getNext();
        }

        result += "}";

        return result;
    }
}

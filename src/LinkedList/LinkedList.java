public class LinkedList {
    private Node head;
    // Constructors
    public LinkedList(){
    }
    public LinkedList(Object e){
        this();
        head.setElement(e);
        head.setNextNode(null);
    }
    public LinkedList(Node n){
        head = n;
    }

    //Getters
    public void insertAtHead(Object e){
        Node newNode = new Node(e);
        newNode.setNextNode(this.head);
        this.head = newNode;

    }
    public void insetAtTail(Object e){
        Node newNode = new Node (e);
//        System.out.println(toString());
        if(head!=null){
            Node current = this.head;
            while(current.getNextNode()!= null){
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
//            System.out.println(toString());
//            this.head = current;
//            System.out.println(toString());
        }

    }
    public void deleteAtHead(Node n){}
    public String searchFor(String e){return "Found";}
    public int length(){
        int count=0;
        Node current = this.head;
        while(current != null){
            count++;
            current = current.getNextNode();
        }
        return count;
    }

    public String toString(){
        String result = "";
        Node current = this.head;

        while(current != null){
            result += current.toString();
            current = current.getNextNode();
        }

        return result;
    }
}

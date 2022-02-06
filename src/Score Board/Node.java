public class Node {
    private Object element;
    private Node next;

    public Node(Object e){
        element = e;
    }

    // Getters & Setters
    public Object getElement() {         return element;     }
    public Node getNext() {        return next;    }

    public void setElement(Object element) {        this.element = element;    }
    public void setNext(Node next) {        this.next = next;    }

    public String toString(){
        return element + " -> ";
    }

}

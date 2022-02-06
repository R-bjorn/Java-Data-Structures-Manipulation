public class Node {
    private Object element;
    private Node nextNode;

    public Node(Object e){
        element = e;
    }

    //Getters
    public Object getElement() {        return element;    }
    public Node getNextNode() {        return nextNode;    }
    //Setters
    public void setElement(Object e){       this.element = e;   }
    public void setNextNode(Node next){     this.nextNode = next;   }

    //To String
    public String toString(){
        if(nextNode == null){
            return element + "";
        }
        return element + "  -->  ";
    }
}

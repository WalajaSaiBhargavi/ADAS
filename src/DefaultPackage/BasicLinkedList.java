package DefaultPackage;


public class BasicLinkedList <T> {

    Node first;
    Node last;
    int count;

    public BasicLinkedList(){
        first = null;
        last = null;
        count = 0;
    }

    public void add(T element){
         Node tmp = new Node(element);
         if(first == null){
             first = tmp;
             last = first;
         }else {
             last.setNextNode(tmp);
             last = tmp;
         }
         count++;
    }

    public T remove(){
        if(size() == 0)
            throw new IllegalStateException("No elements present");
        T tmp = first.getData();
        first = first.getNextNode();
        count--;
        return tmp;
    }

    public void insert(T element, int position){
        if(size() < position){
            throw new IllegalStateException("Position is greater than size");
        }
        Node node = new Node(element);
        Node tmp = first;
        for (int i = 0; i < position - 1; i++) {
            tmp = tmp.getNextNode();
        }
        node.setNextNode(tmp.getNextNode());
        tmp.setNextNode(node);
        count++;
    }

    public T remove (int position){
        if(position > size())
            throw new IllegalStateException("position is more than size");
        Node tmp = first;
        for (int i = 0; i < position - 1; i++) {
            tmp = tmp.getNextNode();
        }
        tmp.setNextNode(tmp.getNextNode().getNextNode());
        count--;
        return tmp.getNextNode().getData();
    }

    public T get(int position){
        if(size() == 0 || position > size())
            throw new IllegalStateException("bad index");
        Node tmp = first;
        for (int i = 0; i < size() ; i++) {
            if(position == i)
                return tmp.getData();
            tmp = tmp.getNextNode();
        }
        return null;
    }

    public int find(T element){
        if(size() == 0){
            throw new IllegalStateException("empty list");
        }
        Node tmp = first;
        for (int i = 0; i < size() ; i++) {
            if(element.equals(tmp.getData()))
                return i;
            tmp = tmp.getNextNode();
        }
        return -1;
    }

    public int size(){
        return count;
    }

    private class Node{
        Node nextNode;
        T data;
        public Node(T data){
            this.data = data;
            this.nextNode = null;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public T getData() {
            return data;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }
}

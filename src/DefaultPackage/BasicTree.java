package DefaultPackage;


public class BasicTree <X extends Comparable<X>> {

    Node root;
    private int size;
    public BasicTree(){
        this.root = null;
    }
    public void add(X element){
        Node<X> node = new Node<>(element);
        if(root == null){
            root = node;
            size++;
        }else {
            insert(node, root);
        }
    }

    private void insert(Node child, Node parent){
        if(child.getItem().compareTo(parent.getItem()) < 0){
             if(parent.getLeft() == null){
                 parent.setLeft(child);
                 child.setParent(parent);
                 size++;
             }
             else {
                 insert(child, parent.getLeft());
             }
        }
        if(child.getItem().compareTo(parent.getItem()) > 0){
            if(parent.getRight() == null){
                parent.setRight(child);
                child.setParent(parent);
                size++;
            }
            else {
                insert(child, parent.getRight());
            }
        }
    }

    public boolean contains(X element){
         if(getNode(element)== (null))
             return false;
         return true;
    }

    private Node getNode(X element){
        Node currentNode = this.root;
        while (currentNode != null){
            int val = element.compareTo((X)currentNode.getItem());
            if(val == 0){
                return currentNode;
            }else if(val < 0){
                currentNode = currentNode.getLeft();
            }else if(val > 0){
                currentNode = currentNode.getRight();
            }
        }
        return null;
    }

    public int size(){
        return size;
    }
    private class Node<X extends Comparable<X>>{
        Node left;
        Node right;
        Node parent;
        X item;
        public Node(X item){
            this.item = item;
            this.left = null;
            this.right = null;
            this.parent = null;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public X getItem() {
            return item;
        }

        public void setItem(X item) {
            this.item = item;
        }
    }
}

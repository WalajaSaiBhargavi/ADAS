package DefaultPackage;

public class BasicQueue <T> {
    private T[] data;
    private int front;
    private int end;

    public BasicQueue(){
        this(1000);
    }
    public BasicQueue(int size){
        data = (T[] )new Object[size];
        front = -1;
        end = -1;
    }
    public int size(){
        return end - front + 1;
    }
    public void enqueue(T element){
        if((end + 1) % data.length == front)
            throw new IllegalStateException("Can not add queue full");
        else if (front == -1 && end == -1){
            data[++end] = element;
            ++front;
        }else{
            data[++end] = element;
        }
    }

    public T dequeue(){
        T tmp = null;
        if(size() == 0)
            throw new IllegalStateException("No elements present");
        else if(front == end){
            tmp = data[front];
            data[front] = null; // just for garbage collection purpose
            front = -1;
            end = -1;
        }else{
            tmp = data[front];
            data[front] = null; // just for garbage collection purpose
            front++;
        }
        return tmp;
    }

    public boolean contains(T element){
        boolean found = false;
        if(size() == 0)
            return found;
        for(int i = front; i <= end; i++){
            if(element.equals(data[i])) {
                found = true;
                break;
            }
        }
        return found;
    }

    public T access(int position){
        T tmp = null;
        if(position > size() || position < 0){
            throw new IllegalStateException("Position either exceeded queue size or is less than zero");
        }
        int index = 0;
        for (int i = front; i <= end ; i++) {
            if(index == position){
                tmp = data[i];
            }
        }
        return tmp;
    }
}

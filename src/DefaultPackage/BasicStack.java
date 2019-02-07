package DefaultPackage;

public class BasicStack <T> {
    private T[] data;
    private int stackPointer;
    public BasicStack(){
        data = (T[]) new Object[1000];
        stackPointer = 0;
    }
    public void push(T element){
        data[stackPointer++] = element;
    }

    public T pop(){
        if(size() == 0)
            throw new IllegalStateException("No more elements present");
        return data[--stackPointer];
    }

    public boolean contains(T element){
        for(int i = 0; i< stackPointer; i++){
            if(data[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    public T access(T element){
         while (size() > 0){
             T tmp = pop();
             if(tmp.equals(element))
                 return tmp;
         }
         throw new IllegalStateException("No such element present");
    }

    public int size(){
        return stackPointer;
    }
}

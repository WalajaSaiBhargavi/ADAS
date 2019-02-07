package DefaultPackage;


public class BasicHashTable <X, Y> {
    private HashTable[] data;
    private int size;
    private int capacity;
    public BasicHashTable(int capacity){
        this.capacity = capacity;
        data = new HashTable[capacity];
        size = 0;
    }

    public void put(X key, Y value){
        int hash = getHash(key);
        data[hash] = new HashTable<X, Y>(key, value);
        size++;
    }

    public Y get(X key){
        if(data[getHash(key)].equals(null))
            return null;
        return (Y)data[getHash(key)].getValue();
    }

    private int getHash(X element){
        int hash = element.hashCode()%this.capacity;
        while (data[hash] != null && !data[hash].getKey().equals(element)){
             hash = (hash + 1) % this.capacity;
        }
        return hash;
    }

    private class HashTable <X, Y>{
        private X key;
        private Y value;

        public HashTable(X key, Y value) {
            this.key = key;
            this.value = value;
        }

        public X getKey() {
            return key;
        }

        public void setKey(X key) {
            this.key = key;
        }

        public Y getValue() {
            return value;
        }

        public void setValue(Y value) {
            this.value = value;
        }
    }
}

import java.util.Map;

public class MyHashMap <K,V>{

    private static final int INITIAL_SIZE = 1 << 4;
    private static final int MAXIMUM_CAPACITY = 1 << 30;

    public Entry[] hashTable;

    public MyHashMap(){
        hashTable = new Entry[INITIAL_SIZE];
    }

    public MyHashMap(int capacity){
        int tableSize = tab
    }

    final int tableSizeFor(int cap){
        int n = cap -1;
        n |= n >> 1;
        n
    }


    class Entry<K,V>{
        public K key;
        public V value;
        public Entry next;

        public  Entry(K k,V v) {
            key = k;
            value = v;
        }
    }

}

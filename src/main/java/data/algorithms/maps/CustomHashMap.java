package data.algorithms.maps;

public class CustomHashMap<K, V> {

    // display
    // hash
    // get
    // put

    // First, we will create a array of entries <k,v> pairs
    private Entry<K, V>[] table;
    private final int capacity = 5;

    public CustomHashMap() {
        table = new Entry[capacity];
    }

    static class Entry<K, V> {
        K key;
        V value;

        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(K key, V value) {
        if(key == null) return; // to avoid adding null

        // calculating hash of new key
        var hash = hash(key);

        // creating new entry
        var newEntry = new Entry<K,V>(key, value);

        // if table doesn't have any entry in the array index, then just put the element
        if(table[hash] == null) {
            table[hash] = newEntry;
        } else {
            var previousEntry = (Entry<K,V>) null;
            var currentEntry = table[hash];

            while (currentEntry != null) {
                if(currentEntry.key.equals(key)) {
                    newEntry.next = currentEntry.next;
                    if(previousEntry == null) {
                        table[hash] = newEntry;
                    } else {
                        previousEntry.next = newEntry;
                    }
                    return;
                }
                previousEntry = currentEntry;
                currentEntry = currentEntry.next;
            }
            previousEntry.next = newEntry;
        }

    }

    public V get(K key) {
        var hash = hash(key);

        if(table[hash] == null) return null;

        var tempEntry = table[hash];

        while (tempEntry != null) {
            if(tempEntry.key.equals(key)) return tempEntry.value;
            tempEntry = tempEntry.next;
        }

        return null;
    }

    // TODO
    public V remove(K key) {
        return null;
    }

    public void display() {
        for (var each: table) {
            while (each != null) {
                System.out.println("Key: " + each.key + " Value: " + each.value);
                each = each.next;
            }
        }
    }

    private int hash(K key) {
        return key.hashCode() % capacity;
    }

}

class TestApp {

    public static void main(String[] args) {
        var myMap = new CustomHashMap<Integer, String>();
        myMap.put(1, "One");
        myMap.put(2, "Two");
        myMap.put(6, "Six");
        myMap.put(3, "Three");
        myMap.put(8, "Eight");

        myMap.display();
        System.out.println("myMap.get(8) = " + myMap.get(8));
        System.out.println("myMap.get(3) = " + myMap.get(3));
    }
}
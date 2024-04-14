    public void put(int key, int value) {
    }
    
    private int index(int key) {
        return Math.abs(key) % SIZE;
    }

    public MyHashMap() {
        buckets = new Entry[SIZE];

    private static final int SIZE = 10000; // Choose size to reduce collision
    private Entry[] buckets;

        }
    }
            this.value = value;
            this.next = null;
        public Entry(int key, int value) {
            this.key = key;
        Entry next;
        
    private class Entry {
        int key;
        int value;
class MyHashMap {
[

class MyHashMap {
    private class Entry {
        int key;
        int value;
        Entry next;
        
        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Entry[] buckets;
    private static final int SIZE = 10000; // Choose size to reduce collision

    public MyHashMap() {
        buckets = new Entry[SIZE];
    }
    
    private int index(int key) {
        return Math.abs(key) % SIZE;
    }

    public void put(int key, int value) {
        int bucketIndex = index(key);
        Entry head = buckets[bucketIndex];
        Entry cur = head;
        while (cur != null) {
            if (cur.key == key) {
                cur.value = value;
                return;
            }
            cur = cur.next;
        }
        Entry entry = new Entry(key, value);
        entry.next = head;
        buckets[bucketIndex] = entry;
    }

    public int get(int key) {
        int bucketIndex = index(key);
        Entry cur = buckets[bucketIndex];
        while (cur != null) {
            if (cur.key == key) {
                return cur.value;
            }
            cur = cur.next;
        }
        return -1; // not found
    }

    public void remove(int key) {
        int bucketIndex = index(key);
        Entry cur = buckets[bucketIndex];
        Entry prev = null;
        while (cur != null) {
            if (cur.key == key) {
                if (prev == null) {
                    buckets[bucketIndex] = cur.next;
                } else {
                    prev.next = cur.next;
                }
                return;
            }
            prev = cur;
            cur = cur.next;
        }
    }
}

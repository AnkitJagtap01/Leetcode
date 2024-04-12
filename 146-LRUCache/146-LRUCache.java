import java.util.HashMap;

class LRUCache {
    private final int capacity;
    private int count;
    private final HashMap<Integer, Node> map;
    private final Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        this.count = 0;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        // Move to the front
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node == null) {
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addNode(newNode);
            ++count;

            if (count > capacity) {
                // pop the tail
                Node tail = popTail();
                map.remove(tail.key);
                --count;
            }
        } else {
            // update the value.
            node.value = value;
            moveToHead(node);
        }
    }

    private void addNode(Node node) {
        // Always add the new node right after head.
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node node){
        // Remove an existing node from the linked list.
        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    private void moveToHead(Node node){
        // Move certain node in between to the head.
        removeNode(node);
        addNode(node);
    }

    private Node popTail() {
        // Pop the current tail.
        Node res = tail.prev;
        removeNode(res);
        return res;
    }

    private static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

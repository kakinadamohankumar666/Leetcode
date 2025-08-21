class MyHashMap {
    private static class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] buckets;
    private static final int SIZE = 1000;

    public MyHashMap() {
        buckets = new Node[SIZE];
    }

    private int getIndex(int key) {
        return key % SIZE;
    }

    private Node find(Node head, int key) {
        Node prev = head;
        Node curr = head.next;
        while (curr != null && curr.key != key) {
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }

    public void put(int key, int value) {
        int index = getIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new Node(-1, -1);
        }
        Node prev = find(buckets[index], key);
        if (prev.next == null) {
            prev.next = new Node(key, value);
        } else {
            prev.next.value = value;
        }
    }

    public int get(int key) {
        int index = getIndex(key);
        if (buckets[index] == null)
            return -1;
        Node prev = find(buckets[index], key);
        return (prev.next == null) ? -1 : prev.next.value;
    }

    public void remove(int key) {
            int index = getIndex(key);
        if (buckets[index] == null) return;
        Node prev = find(buckets[index], key);
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
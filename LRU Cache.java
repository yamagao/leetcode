public class LRUCache {
    HashMap<Integer, LinkedListNode> map = new HashMap<Integer, LinkedListNode>();
    LinkedListNode head;
    LinkedListNode end;
    int capacity;
    int len;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = null;
        end = null;
        len = 0;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            LinkedListNode N = map.get(key);
            setHead(N);
            return N.value;
        }
        else{
            return -1;
        }
    }
    
    public void set(int key, int value) {
        LinkedListNode N;
        if(head == null){
            head = new LinkedListNode(key, value, null, null);
            end = head;
            map.put(key, head);
            len = 1;
            return;
        }
        if(map.containsKey(key)){
            N = map.get(key);
            N.value = value;
            setHead(N);
            return;
        }
        if(len < capacity){
            len++;
            N = new LinkedListNode(key, value, null, head);
            head.previous = N;
            head = N;
            map.put(key, N);
            return;
        }
        if(len == capacity){
            N = new LinkedListNode(key, value, null, head);
            head.previous = N;
            head = N;
            map.put(key, N);
            map.remove(end.key);
            end = end.previous;
            end.next = null;
        }
    }
    
    public void setHead(LinkedListNode N){
        if(N == head){
            return;
        }
        if(N == end){
            end = N.previous;
            N.previous.next = null;
            N.next = head;
            N.previous = null;
            head.previous = N;
            head = N;
            return;
        }
        N.previous.next = N.next;
        N.next.previous = N.previous;
        N.next = head;
        N.previous = null;
        head.previous = N;
        head = N;
    }
}

class LinkedListNode{
    int value;
    int key;
    LinkedListNode previous;
    LinkedListNode next;
    LinkedListNode(int key, int value, LinkedListNode previous, LinkedListNode next){
        this.key = key;
        this.value = value;
        this.previous = previous;
        this.next = next;
    }
}
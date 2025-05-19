class MyLinkedList {

    class ListNode{
        int val;
        ListNode next;

       public ListNode(int val){
        this.val = val;
        this.next = null;
       }
    }

   

    private ListNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

   public int get(int index) {
    if (index < 0 || index >= size) {
        return -1;
    }

    ListNode temp = head;
    for (int i = 0; i < index; i++) {
        temp = temp.next;
    }
    return temp.val;
}

    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            ListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index <0 || index >size) return;
        if(index == 0){
            addAtHead(val);
            return;
        }
        ListNode newNode = new ListNode(val);
        ListNode temp = head;
        int i =0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
    if (index < 0 || index >= size) {
        return;
    }

    if (index == 0) {
        head = head.next; 
    } else {
        ListNode temp = head;
        int count = 0;

        while (count < index - 1) {
            temp = temp.next;
            count++;
        }

        temp.next = temp.next.next;
    }

    size--;
}

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
public class SingleLinkedList {
    public List head;

    public void insertFront(int value) {
        List baru = new List(value);
        baru.next = head;
        head = baru;
    }

    public void removeFront() {
        if ( head != null ) {
            //List temp = head;
            head = head.next;
            //delete temp
        }
    }

    public void insertBack(int value) {
        List current = head;
        if(current == null) {
            List baru = new List(value);
            current = baru;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            List baru = new List(value);
            current.next = baru;
        }
    }

    public void removeBack() {
        if (head != null) {
            List current = head;
            if (current.next == null) {
                head = null;
            } else {
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
        }
    }

    public void insertIn(int n, int value) {
        if(head == null && n ==0) {
            List baru = new List(value);
            head = baru;
        } else {
            List current = head;
            int i = 0;
            while (current.next != null && i < n-1) {
                current = current.next;
                i++;
            }
            if (current.next != null) {
                List baru = new List(value);
                baru.next = current.next;
                current.next = baru;
            }
        }
    }

    public void removeIn(int n) {
        if (head != null) {
            if (n == 0) {
                head = head.next;
            } else {
               List current = head;
               int i = 0;
               while (current.next != null && i < n-1) {
                   current = current.next;
                   i++;
               }
               if (current.next != null) {
                   current.next = current.next.next;
               }
            }
        }
    }
}

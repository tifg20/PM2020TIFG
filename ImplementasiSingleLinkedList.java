public class ImplementasiSingleLinkedList {
    public static void main(String[] args) {

        SingleLinkedList2 lst = new SingleLinkedList2();

        lst.insertFront(3);
        lst.insertFront(2);
        lst.insertFront(4);
        lst.insertFront(6);

        System.out.println( lst.removeFront() );
        System.out.println( lst.removeFront() );
        System.out.println( lst.removeFront() );
        System.out.println( lst.removeFront() );



    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("===== QUEUE =====");

        Queue queue = new Queue();
        queue.enQueue(4);
        queue.enQueue(7);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(5);

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        queue.enQueue(99);
        queue.enQueue(79);
        queue.enQueue(69);
        queue.enQueue(49);



        System.out.println("Size: "+queue.getSize());
        System.out.println(queue.isFull());

        queue.show();
    }
}

public class Queue {
    int queue[] = new int[5];
    int front;
    int rear;
    int size;

    public void enQueue(int data){
        //queue[front] = data;
        if(!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % queue.length;
            size++;
        } else {
            System.out.println("The Queue is Full!!");
        }
    }

    public int deQueue(){
        int data = queue[front];
        front = (front+1)%queue.length;
        size--;
        return data;
    }
    public void show(){
        for(int i = 0; i < size; i++){
            System.out.print(queue[(front+i)%queue.length] + " , ");
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size > queue.length;
    }
}

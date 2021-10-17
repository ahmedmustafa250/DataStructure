package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        queue q=new queue(5);

//        circularQueue cq=new circularQueue(5);
//        cq.insert(10);
//        cq.insert(20);
//        cq.insert(30);
//        cq.insert(40);
//        cq.insert(50);
//        cq.remove();
//        cq.insert(400);
////        cq.insert(300);
////        cq.insert(200);
//        cq.display();
//

//        priorityQueue pq=new priorityQueue(5);
//        pq.add(10);
//        pq.add(20);
//        pq.add(2);
//        pq.add(99);
//        pq.display();
//        pq.poll();
//        pq.poll();
//        pq.peek();
//        pq.poll();
//        pq.peek();
//        pq.poll();
//        pq.peek();

        LinkedList list = new LinkedList();
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        list.insertAtFirst(6);

//        list.displayList();
//        list.insertAtFirst(10);
//        list.insertAtPos(7,1);
        list.displayList();

        list.deletepos(2);

        list.displayList();

        System.out.println("");
//        System.out.println(list.getSize());
//        System.out.println(list.isEmpty());

    }
}

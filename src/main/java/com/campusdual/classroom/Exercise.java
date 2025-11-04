package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise {
    public static Queue<String> createQueue() {
        Queue<String> surnameQueu = new LinkedList<>();

       surnameQueu.offer("Smith");
       surnameQueu.offer("Montessori");
       surnameQueu.offer("Peralta");
       surnameQueu.offer("House");

       return surnameQueu;

    }
    public static void printAndEmptyQueue(Queue<String> queue) {

        while (!queue.isEmpty()){
            String element = queue.poll();
            System.out.println(element);
        }

    }

    public static void main(String[] args) {
        Queue<String> myqueue = createQueue();
        System.out.println("Elemento en la cima de la cola: " + myqueue.peek());
        System.out.println("Elementos de la cola:");
        printAndEmptyQueue(myqueue);
        System.out.println("¿Cola vacía? " + myqueue.isEmpty());

    }

}

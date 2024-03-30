package allotherprograms;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue_test {
    public static void main(String[] args) {
        PriorityQueue<String> pq= new PriorityQueue<String>();
        pq.add("amit");
        pq.add("shanu");
        pq.add("killer");
        pq.add("amantri");
        pq.add("loope");
        System.out.println("head"+pq.element());;
        System.out.println("head"+pq.peek());

        Iterator itr=pq.iterator();
           while(itr.hasNext()){
            System.out.println(itr.next());
        }
        pq.remove();
        pq.poll();

        Iterator itr2=pq.iterator();
            while(itr2.hasNext()){
                System.out.println(itr2.next());
            }
        }
    }


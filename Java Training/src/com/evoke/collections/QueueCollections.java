package com.evoke.collections;

import java.util.Queue;
import java.util.LinkedList;
public class QueueCollections {

	public static void main(String[] args) {
Queue<Integer>numbers = new LinkedList<>();
		
		numbers.offer(1);
		numbers.offer(2);
		numbers.offer(3);
		System.out.println("Queue:" +numbers);
		
		int accessednumber = numbers.peek();
		System.out.println("Accessed element:" +accessednumber);
	
		int removednumber = numbers.poll();
		System.out.println("removed element:" +removednumber);
		
		System.out.println("updated queue:" +numbers);
		
		
	}

	}



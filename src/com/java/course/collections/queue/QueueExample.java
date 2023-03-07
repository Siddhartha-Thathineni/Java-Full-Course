package com.java.course.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {

		return Integer.compare(value2.length(), value1.length());
	}

}
public class QueueExample {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.poll();
		System.out.println(queue);

		queue.offer("Apple");
		queue.addAll(List.of("Zebra", "Monkey", "Goat"));
		System.out.println(queue);
		queue.poll();
		System.out.println(queue); // [Goat, Zebra, Monkey]

		queue.poll();
		System.out.println(queue); // [Zebra, Monkey]

		queue.poll();
		System.out.println(queue); // [Monkey]

		queue.poll();
		System.out.println(queue); // []

		// How to process based on a custom order ()
	}
}

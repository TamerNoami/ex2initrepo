package exercise;

class Person {
	String name;
	Person(String n) {
		name = n;
	}
}

class Address {
	String streetName;
	Address(String s) {
		streetName = s;
	}
}

public class Main {

	public static void hashTableExamples() {
		
		HashTable table = new HashTable();
		
		Person tom = new Person("Tom");
		Person jim = new Person("Jim");
		
		table.put(tom, new Address("Sveavagen"));
		table.put(jim, new Address("Lindstedtsvagen"));
		
		// it's possible that:
		// tom.hashCode() == jim.hashCode()
		
	}

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(9);
//		int res = l.get(0);
//		System.out.println("res: " + res);
		
		
		
//		int res2 = l.get(1);
//		System.out.println("res2: " + res2);
		long startTime = System.nanoTime();
		l.printAll();
		long stopTime = System.nanoTime();
		System.out.println("Print All 1 time is :" + (stopTime - startTime)  + " nanoseconds");
		
		startTime = System.nanoTime();
		l.printAll2();
		stopTime = System.nanoTime();
		System.out.println("Print All 2 time is :" + (stopTime - startTime) + " nanoseconds");
			
		
		System.out.println("Size : " + l.size());
		
		System.out.print("Concat 1 : " );l.concat();
										l.concat2();
		
		System.out.print("Reverse : " );l.reverse();
		
		
		
	}

}
package listsAndArraylist;

import java.time.DayOfWeek;
import java.util.*;

public class ListAndArray {

	public static void main(String[] args) {

//		List<Integer> myNumberList;
		int sum = 0;
		ArrayList<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			myList.add(i);
		}

		for (Integer i : myList) {
			sum += i;
		}
//		System.out.println("My sum is " + sum);

		// Java collection classes slide 22
		myList.sort((x, y) -> x.compareTo(y));

		// Java collection classes slide 23
		List<Double> listOfDoubles = Arrays.asList(2.0, 2.7, 5.4, 3.6);
//		System.out.println(listOfDoubles.getClass().getName());

		List<String> str = new ArrayList<>();
		str.add("a string");
//		System.out.println(str.get(0));

//		System.out.println(myList.size());
//		System.out.println(myList.indexOf(50));
//		System.out.println(myList.contains(80));
//		System.out.println(myList.contains(180));
//		boolean success = myList.remove((Integer)80);
//		System.out.println(success);
//		success = myList.remove((Integer)180);
//		System.out.println(success);
//		
//		System.out.println(myList.indexOf(80));

		// Collections
		// More OOP

		LinkedList<Integer> linkOne = new LinkedList<Integer>();
		linkOne.add(23);
		linkOne.add(12);
		linkOne.add(1, 65);
		System.out.println(linkOne.get(1));
		linkOne.set(0, 98);
		System.out.println(linkOne.indexOf(12));
		linkOne.remove(1);
		System.out.println(linkOne.size());
		System.out.println(linkOne.contains(98));
		
		// key, value pairs
		// id, employee
		
		// Maps slide 48
		
//		EnumMap<DayOfWeek, Integer> map = new EnumMap<>(DayOfWeek.class);
//		map.put(DayOfWeek.FRIDAY, 23);
//		
//		HashMap<Integer, String> cars = new HashMap<>();
//
//		cars.containsValue(cars);
//		cars.containsKey(cars);
		
		HashSet<String> setHashList = new HashSet<String>();
		
		setHashList.add("One");
		setHashList.add("Two");
		setHashList.add("Ethan");
		setHashList.add("Java");
		setHashList.add("Two");
		
		Iterator<String> itr = setHashList.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

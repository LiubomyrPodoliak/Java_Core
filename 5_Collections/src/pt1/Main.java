package pt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> myCollection = new ArrayList<>();
		myCollection.add(-5);
		myCollection.add(50);
		myCollection.add(20);
		myCollection.add(5);
		myCollection.add(40);
		myCollection.add(19);
		myCollection.add(7);
		myCollection.add(6);
		myCollection.add(10);
		myCollection.add(-37);

		System.out.println(" First view " + myCollection);

		// position >5
		List<Integer> newCollection = new ArrayList<>();

		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 5) {
				newCollection.add(i);
			}
		}

		System.out.println("position of element biggest the five" + newCollection);

		// remove

		Iterator<Integer> iterator = myCollection.iterator();
		while (iterator.hasNext()) {
			Integer integer = iterator.next();
			if (integer > 20) {
				iterator.remove();
			}
		}
		System.out.println(myCollection);

		//
		if (myCollection.size() > 2) {
			myCollection.set(2, 1);

		} else {
			System.out.println(2 + " element does not exist");
		}
		if (myCollection.size() > 8) {
			myCollection.set(8, 1);

		} else {
			System.out.println(8 + " element does not exist");
		}

		if (myCollection.size() > 5) {
			myCollection.set(5, -4);

		} else {
			System.out.println(5 + " element does not exist");
		}
		System.out.println(myCollection);

		// sort
		Collections.sort(myCollection);
		System.out.println("soeted collections " + myCollection);
	}

}

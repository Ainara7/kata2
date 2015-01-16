package kata2;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortMostFrequent {

	public static void main(String[] args) {
		int[] elements = { 1, 3, 4, 1, 5, 2, 3, 6, 6, 6, 4, 1, 2, 6, 2, 3, 1, 2, 1, 5, 5, 1, 1, 5, 4 };
		ArrayList<Integer> elementList = new ArrayList<>();

		for(int element : elements)
			elementList.add(element);
		
		Collections.sort(elementList);
		
		int number = 0;
		int times = 0;
		int currentNumber = -1;
		int currentTimes = 0;
		for (Integer element : elementList){
			if(currentNumber != element){
				if(currentTimes > times){
					number = currentNumber;
					times = currentTimes;
				}
				currentNumber = element;
				currentTimes = 0;
			}
			currentTimes++;
		}

		System.out.println("The most frequent element is " + number + " and it occurs " + times + " times");
	}
}
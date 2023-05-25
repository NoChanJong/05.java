package exercise.answer;

import java.util.Arrays;
import java.util.stream.Stream;

public class Exercise14_5 {

	public static void main(String[] args) {
		
		String[] strArr = {"aaa", "bb", "c", "dddd"};
		
		Stream<String> stream = Arrays.stream(strArr);
		int sum = stream.mapToInt(String::length).sum();
		System.out.println("sum = " + sum);
	}

}

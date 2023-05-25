package exercise.answer;

import java.util.Arrays;
import java.util.stream.Stream;

public class Exercise14_6 {

	public static void main(String[] args) {
		String[] strArr = {"aaa", "bb", "c", "dddd"};
		
		Stream<String> stream = Arrays.stream(strArr);
		
		int len = stream.mapToInt(String::length).max().getAsInt();
		System.out.println(len);
	}

}

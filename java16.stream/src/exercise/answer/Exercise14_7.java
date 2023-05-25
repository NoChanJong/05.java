package exercise.answer;

import java.util.Random;
import java.util.stream.IntStream;

public class Exercise14_7 {

	public static void main(String[] args) {
		IntStream ran = new Random().ints(1, 46);
		ran.distinct().limit(6).sorted().forEach(System.out::println);
	}

}

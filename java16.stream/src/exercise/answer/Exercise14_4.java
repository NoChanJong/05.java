package exercise.answer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class Exercise14_4 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.stream().flatMap(i -> Stream.of(1,2,3,4,5,6).map(i2 -> new int[] {i, i2}))
		.filter(iArr -> iArr[0] + iArr[1]==6)
		.forEach(iArr -> System.out.println(Arrays.toString(iArr)));
		
//		int[] dice = {1,2,3,4,5,6};
//		IntStream is = Arrays.stream(dice);
//		is.filter(iArr -> dice[0] + dice[1] == 6).forEach(iArr -> System.out.println(iArr));
	}

}

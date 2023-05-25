package com.lec.ex01_intro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class parallelMain {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동", "홍길순", "홍길자", "홍길녀", "홍길상");
		
		// 1. 직렬(순차)처리 : stream()
		Stream<String> stream = list.stream();
		stream.forEach(s -> System.out.print(s + ", "));
		System.out.println();
		
		stream = list.stream();
		stream.forEach(s -> parallelMain.print(s));
		System.out.println();
		
		stream = list.stream();
		stream.forEach(parallelMain :: print);
		System.out.println();
		
		// 2. 병렬처리 : parallelStream()
		Stream<String> pStream = list.parallelStream();
		pStream.forEach(parallelMain :: print);
		
	}

	private static void print(String name) {
//		System.out.print(name + ", ");
		System.out.println(name + " : " + Thread.currentThread().getName());
		
	}

}
































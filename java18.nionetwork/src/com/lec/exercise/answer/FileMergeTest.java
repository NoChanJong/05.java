package com.lec.exercise.answer;

import java.io.File;
import java.io.FileWriter;

public class FileMergeTest {

	public static void main(String[] args) throws Exception {

		if(args.length != 1) {
			System.out.println("USAGE: java FileMergeTest MERGE_FILENAME FILENAME1 FILENAME2 ... ");
			System.exit(0);
		}
		
		File file1 = new File("c:/temp/1.txt");
		FileWriter fw1 = new FileWriter(file1, false);
		
		File file2 = new File("c:/temp/2.txt");
		FileWriter fw2 = new FileWriter(file1, false);

		File file3 = new File("c:/temp/3.txt");
		FileWriter fw3 = new FileWriter(file1, false);
		
		File result = new File("c:/temp/result.txt");
		
		fw1.write("111111111");
		fw2.write("222222222");
		fw3.write("3333333333333");
		
		
	}

}

































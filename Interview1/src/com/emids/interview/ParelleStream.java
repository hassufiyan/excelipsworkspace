package com.emids.interview;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

public class ParelleStream {

	public static void main(String[] args) throws IOException {
		
		
		File files=new File("M:\\Documents\\Textfile.txt");
		

//		Stream<String> text=Files.lines(files.toPath());
		
	List<String> text=Files.readAllLines(files.toPath());
		
		
		text.parallelStream().forEach(System.out::println);
		
	
	}

}

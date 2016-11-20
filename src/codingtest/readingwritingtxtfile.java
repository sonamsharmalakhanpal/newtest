package codingtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readingwritingtxtfile {

	private static final int String = 0;

	public static void main(String[] args) throws IOException {
		
/*		// create a txt file
		File fl = new File("C:\\Users\\meetg\\Documents\\automationtextfile.txt");
		fl.createNewFile();
		
		// write in txt file
		FileWriter fw = new FileWriter("C:\\Users\\meetg\\Documents\\automationtextfile.txt");
		@SuppressWarnings("resource")
		BufferedWriter bf = new BufferedWriter(fw);
		bf.write("Thankyou maa parwati ji thankyou so much all you have given to me");
		bf.newLine();
		bf.write("thankyou Shiv Ji ");
		bf.flush();*/
		
		//read txt file
		
		FileReader fr = new FileReader("C:\\Users\\meetg\\Documents\\automationtextfile.txt");
		BufferedReader br = new BufferedReader(fr);
		
		/*System.out.println(br.readLine());
		System.out.println(br.readLine());*/
//		System.out.println(br.read());
		String i="";
		
		while ((i=br.readLine())!=null) {
			
			System.out.println(i);
			
		}
		
		
		
		
		
		

		
	}

	

}

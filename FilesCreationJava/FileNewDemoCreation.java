package FilesCreationJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileNewDemoCreation {

	public static void main(String[] args) throws Throwable {

		// create file
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\demoJava\\src\\test\\resources\\madhu");
		if (file.createNewFile()) {
			System.out.println("file is created");
		} else {
			System.out.println("file already exists");
		}
		
		
		boolean exists = file.exists();
        if (exists == true) {
            System.out.println("Executable: "+ file.canExecute());
            System.out.println("Readable: "+ file.canRead());
            System.out.println("Writable: "+ file.canWrite());
        }
	
		// write content method-1
		FileWriter writer = new FileWriter(file);
		writer.write("data");
		writer.close();
		
		
//		// write content method-2
//		BufferedWriter bw = new Bufferedwriter(new FileWriter(file));
//		bw.write("test data");
//     	bw.close();
		
		
//		//READ CONTENT METHOD-1
//		BufferedReader br = new BufferedReader(new FileReader(file));
//		String st;
//		while ((st=br.readLine())!= null)
//		System.out.println(st);
		
			
//		// read content method-2
//		FileReader reader = new FileReader(file);
//		int c;
//		while ((c = reader.read()) != -1) {
//			char ch = (char) c;
//			System.out.print(ch);
		
		
		//read content method-3
		Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());

		}
	}

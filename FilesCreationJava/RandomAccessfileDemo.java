package FilesCreationJava;


import java.io.RandomAccessFile;

public class RandomAccessfileDemo {

	public static void main(String[] args) throws Throwable {

		RandomAccessFile geek = new RandomAccessFile("madhu", "rw");

		geek.writeUTF("H");

		geek.seek(0);

		System.out.println("Use of read() method : " + geek.read());

	}

}

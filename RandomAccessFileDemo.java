package interview;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		String mode="rw";
		String name="access.txt";
	    RandomAccessFile random=new RandomAccessFile( name, mode );
	    String string="Hello world";
	    random.writeChars(string);
	    random.seek(0);
	    String readString=random.readLine();
	    System.out.println(readString);
	}
}

package SerializationDeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
	public static void main(String [] args) {
		Student s1 = new Student();
		s1.rollNo = 337;
		s1.name = "Serif";
		
		String fileName = "D:\\Testing\\Automation\\TextFile.txt";
		
		try {
			FileOutputStream fos = new FileOutputStream(fileName); //FileOutputStream → opens the file for writing.
			ObjectOutputStream oos = new ObjectOutputStream(fos); //ObjectOutputStream → converts the object into bytes.
			oos.writeObject(s1); //writeObject(s1) → writes the object into the file.
			oos.close();
			fos.close();
			System.out.println("Object saved in file");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

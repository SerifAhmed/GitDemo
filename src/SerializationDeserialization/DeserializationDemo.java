package SerializationDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationDemo {
	
	public static void main(String [] args) throws ClassNotFoundException {
		
		String fileName = "D:\\Testing\\Automation\\TextFile.txt";
		
		try {
			FileInputStream fis = new FileInputStream(fileName); //FileInputStream → opens the file for reading.
			ObjectInputStream ois = new ObjectInputStream(fis); //ObjectInputStream → converts bytes back into a Java object.
			
			Student obj = (Student)ois.readObject(); //readObject() → reads and reconstructs the Student object.
			System.out.println(obj.rollNo);
			System.out.println(obj.name);
			
			ois.close();
			fis.close();
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

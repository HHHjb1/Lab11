/**
 * File: Lab11.java
 * @author Jonathan Forwood, Benji Godo
 * Created on: Nov 14, 2025
 * Modified on: Nov 14, 2025
 * Description:  Lab11
 */


import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lab11 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try ( // Create an input stream for file pricelist.dat
				DataInputStream input = new DataInputStream(new FileInputStream("src/people.dat"));
				) {

			// Read student prices from the file
			while (true) {
				System.out.println(input.readInt());
				System.out.println(input.readUTF());
				System.out.println(input.readUTF());
				System.out.println(input.readInt());
				System.out.println(input.readDouble());
				System.out.println();
			}
		} catch (EOFException ex) {	
			System.out.println("Reached end of file");
		}
	}

}

package com.learning.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputAndOutputStream {

	static File file, dir;

	public static void main(String[] args) throws IOException {

		String directory = "Files" + File.separator + "Text Files";
		dir = new File(directory);

		if (!dir.exists()) {
			dir.mkdirs();
		}

		file = new File(directory + File.separator + "FileInputAndOutputStream.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}

		System.out.println(file.getName()); // Returns the Name of the File
		System.out.println(file.getAbsolutePath()); // Returns the absolute path of the file
		System.out.println(file.canWrite()); // Returns the boolean value if file is writable or not

		try {
			FileOutputStream fos = new FileOutputStream(file);
			String str = "Mehul Is Writing";
			try {
				fos.write(str.getBytes());
				fos.flush();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis = new FileInputStream(file);
			int i;
			try {
				while ((i = fis.read()) != -1) {
					System.out.print((char) i);
				}
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// file.delete(); It Will Delete the File
	}

}
package com.learning.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {
	static File file;

	public static void main(String[] args) {

		file = new File("FileWriterAndReader.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}

		try {
			FileWriter fw = new FileWriter(file);
			fw.write("Mehul Is Writing");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileReader fr = new FileReader(file);
			int i;
			try {
				while ((i = fr.read()) != -1) {
					System.out.print((char) i);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
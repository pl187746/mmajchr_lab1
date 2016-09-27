package lab1.lab1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {

	public static void saveFile(String fileName, String correctString, String incorrectString, Callback callback) {
		FileWriter fw = null;
		File file = null;
		String result;
		try {
			file = new File(fileName + ".txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			fw = new FileWriter(file);
			fw.write("Hello World");
			fw.flush();
			fw.close();
			System.out.println(correctString);
			result = callback.callback(true);
		} catch (IOException e) {
			System.out.println(incorrectString);
			result = callback.callback(false);
			e.printStackTrace();
		}
	}
}

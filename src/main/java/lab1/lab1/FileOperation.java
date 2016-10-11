package lab1.lab1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {

	public static void saveFile(String fileName, String correctString, String incorrectString, FirstCallback callback) {
		String result = fileName;
		while (result != null) {
			result = saveNewFile(result, callback, correctString, incorrectString);
		}

	}

	public static String saveNewFile(String fileName, FirstCallback callback, String correctString, String incorrectString) {
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
			return callback.callback(true);
		} catch (IOException e) {
			System.out.println(incorrectString);
			result = callback.callback(false);
		}
		return result;
	}
}

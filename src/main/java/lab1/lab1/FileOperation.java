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

	public static String saveNewFile(String fileName, FirstCallback callback, String correctString,
			String incorrectString) {

		File file = null;
		String result;
		SaveResult saveResult = new SaveResult(fileName, correctString, incorrectString);
		SecondCallback seconCallback = new SecondCallbackImpl(saveResult);
		try {
			file = new File(fileName + ".txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			try (FileWriter fw = new FileWriter(file)) {
				fw.write("Hello World");
				fw.flush();
			}
			System.out.println(correctString);
			saveResult.setSuccess(true);
			return callback.callback(seconCallback);
		} catch (IOException e) {
			System.out.println(incorrectString);
			saveResult.setSuccess(false);
			result = callback.callback(seconCallback);
		}
		return result;
	}
}

package lab1.lab1;

public class SaveResult {
	private String fileName;
	private String correctMsg;
	private String incorrectMsg;
	private boolean success;

	public String getFileName() {
		return fileName;
	}

	public String getCorrectMsg() {
		return correctMsg;
	}

	public String getIncorrectMsg() {
		return incorrectMsg;
	}

	public boolean isSuccess() {
		return success;
	}

	public SaveResult(String fileName, String correctMsg, String incorrectMsg, boolean success) {
		super();
		this.fileName = fileName;
		this.correctMsg = correctMsg;
		this.incorrectMsg = incorrectMsg;
		this.success = success;
	}
}

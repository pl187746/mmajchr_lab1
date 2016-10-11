package lab1.lab1;

public class SaveResult {
	private String fileName;
	private String correctMsg;
	private String incorrectMsg;
	private boolean success;

	public SaveResult() {
	}

	public SaveResult(String fileName, String correctMsg, String incorrectMsg) {
		super();
		this.fileName = fileName;
		this.correctMsg = correctMsg;
		this.incorrectMsg = incorrectMsg;

	}

	public SaveResult(String fileName, String correctMsg, String incorrectMsg, boolean success) {
		super();
		this.fileName = fileName;
		this.correctMsg = correctMsg;
		this.incorrectMsg = incorrectMsg;
		this.success = success;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setCorrectMsg(String correctMsg) {
		this.correctMsg = correctMsg;
	}

	public void setIncorrectMsg(String incorrectMsg) {
		this.incorrectMsg = incorrectMsg;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

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

}

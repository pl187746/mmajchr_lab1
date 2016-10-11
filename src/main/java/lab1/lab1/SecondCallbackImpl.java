package lab1.lab1;

public class SecondCallbackImpl implements SecondCallback {
	
	private SaveResult result;

	public SaveResult callback() {
		return result;
	}

	public SecondCallbackImpl(SaveResult result) {
		super();
		this.result = result;
	}

}

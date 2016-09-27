package lab1.lab1;
import java.util.*;

public class CallbackImpl implements Callback {
	
	private Scanner scan;
	
	public CallbackImpl(Scanner sc) {
		this.scan = sc;
	}

	public String callback(boolean result) {
		if(result)
			return null;
		while(true) {
			System.out.print("Czy chcesz zapisac plik pod inna nazwa? [T/N] ");
			String c = scan.nextLine();
			if(c.startsWith("T") || c.startsWith("t")) {
				String newFileName = scan.nextLine();
				return newFileName;
			} else if(c.startsWith("N") || c.startsWith("n"))
				return null;
		}
	}

}

package Graph;

import java.io.IOException;
public class BadFileException extends IOException {
	public BadFileException(String e) {
		super(e);
	}
}
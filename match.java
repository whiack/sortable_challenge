import java.utile.Scanner;


public viod main() {
	File file = new File(pathname);
	StringBuilder fileContents = new StringBuilder((int) file.length());
	Scanner scanner = new Scanner(file);
	String lineSeparator = System.getProperty("line.separator");

	try {
		while(scanner.hasNextLine()) {
			fileContents.append(scanner.nextLine() + lineSeparator);
		}
		return fileContents.toString();
	} finally {
		scanner.close();
	}
}
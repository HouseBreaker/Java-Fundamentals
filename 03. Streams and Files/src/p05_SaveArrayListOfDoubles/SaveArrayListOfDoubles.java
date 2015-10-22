package p05_SaveArrayListOfDoubles;

import java.io.*;
import java.util.ArrayList;

public class SaveArrayListOfDoubles {
	private static ArrayList<Double> testList = new ArrayList<>();

	public static void main(String[] args) {

		testList.add(22.5);
		testList.add(12.3);
		testList.add(34.3);
		testList.add(63.4);
		testList.add(96.0);

		saveObjectToFile(testList);
		loadObjectFromFile();
	}

	private static void saveObjectToFile(ArrayList inputList) {
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("res/p05_SaveArrayListOfDoubles/doubles.list")))) {
			oos.writeObject(inputList);
		} catch (IOException ioe) {
			System.out.println(ioe.toString());
		}
	}

	private static void loadObjectFromFile() {
		try (ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream("res/p05_SaveArrayListOfDoubles/doubles.list")))) {
			System.out.println(ois.readObject());
		} catch (ClassNotFoundException | IOException cnne) {
			System.out.println(cnne.toString());
		}
	}

}

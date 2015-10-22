package p06_SaveCustomObjectToFile;

import java.io.*;


public class SaveCustomObjectToFile {
	private static Course[] courses;

	public static void main(String[] args) {
		courses = new Course[3];
		courses[0] = new Course("Advanced C#", 503);
		courses[1] = new Course("Algorithms and Data Structures", 302);
		courses[2] = new Course("Java Fundamentals", 246);

		saveObjects();
		loadObjects();
	}

	private static void saveObjects() {
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("res/p06_SaveCustomObjectToFile/courses")))) {
			for (Course c : courses) {
				oos.writeObject(c);
			}
		} catch (IOException ioe) {
			System.out.println(ioe.toString());
		}
	}

	private static void loadObjects() {
		try (ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream("res/p06_SaveCustomObjectToFile/courses")))) {
			Object obj;

			while ((obj = ois.readObject()) != null) {
				System.out.println("Course: " + obj);
			}
		} catch (EOFException eof) {
		} catch (ClassNotFoundException | IOException cnfe) {
			System.out.println(cnfe.toString());
		}
	}
}

import java.util.*;
import java.io.*;


public class Del {

	static String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
	public static void main(String args[]) throws IOException{
		for(String s : alpha) {
			File f = new File(s + "in.txt");
			if(f.delete()) {
				System.out.println("File Deleted Successfully " + s  + "in.txt");
			}
			else {
				System.out.println("File Doesn't Exist " + s  + "in.txt");
			}
			f = new File(s + "out.txt");
			if(f.delete()) {
				System.out.println("File Deleted Successfully " + s  + "out.txt");
			}
			else {
				System.out.println("File Doesn't Exist " + s  + "out.txt");
			}
		}
	}
}
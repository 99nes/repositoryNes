package pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		//File f = new File ("/home/super/temp");
		//existe(f);
		String[][]s=new String [3][2];
		s=a(s);
	}
	public static void existe (File f) {
		if (f.exists()) {
			f.delete();
			System.out.println("Carpeta borrada");
		}else {
			f.mkdir();
			System.out.println("Carpeta creada");
		}
	}
	public static String[][] a(String [][]s) {
		File f = new File ("prova.txt");
		String paso;
		try {
			Scanner lc = new Scanner (f);
			for (int i = 0; i < s.length; i++) {
				for (int j = 0; j < s.length; j++) {
					paso=lc.next();
					System.out.println(s[i][j]+' ');
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return s;
	}
}

// File : FileReader.java
// PIC : Denita Hanna Widiasuti - 13514008

import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.List;
import java.io.File;
import java.util.Scanner;
import java.net.URL;

/**
 *
 * @author Denita Hanna Widiasuti - 13514008
 */
public class FileReader {
	private File file;
	private Scanner sc;
	//private String fileName;
	private int nBrs; 	/**< nBrs adalah jumlah baris area Zoo, */
	private int nKol;	/**	nKol adalah jumlah kolom area Zoo */
	private int nCellType; /**< nCellType adalah jumlah tipe Cell yang ada */
	private String[] listCellType; 
				/**< listCellType adalah list nama tipe Cell:
								airhabitat
								waterhabitat
								landhabitat
								road
								park
								restourant 
								entrance
								exit*/
	private char[] listCellSimbol; 
				/**< listCellSimbol adalah list karakter simbol Cell
								# airhabitat
								~ waterhabitat
								@ landhabitat
								- road
								* park
								$ restourant 
								\ entrance
								/ exit*/
	private char[][] maps; /**< peta zoo */
	private int nCage; /**< jumlah Cage yang akan dibangun */
	private char[] listCageSimbol; /**< listCageSimbol adalah list karakter simbol Cage */
	private String[] listCagetype;  /**< listCagetype adalah list tipe habitat Cage */
	private int[] listNCageArea;  /**< listNCageArea adalah jumlah Cell yang akan dibangun pada masing2 Cage */
	private int[] listNAnimal;  /**< listNAnimal adalah jumlah animal yang akan diciptakan pada masing2 Cage*/
	private int[][] listPos; /**< listPos adalah list dari posisi Cage yang akan dibangun */

	/**
	* Membaca file eksternal 
	*
	* @param fileName Nama file eksternal yang akan dibaca
	*/
	public FileReader(String fileName) {

		System.out.println("making filereader");
		//URL path = ClassLoader.getSystemResource(fileName);
		//file = new File(path.toString());
		file = new File(fileName);
		try {
			//read();
			sc = new Scanner(file);
			System.out.println("file loaded");
		} catch (FileNotFoundException e) {
			System.out.println(e);

		}
	}

	/**
	* Membaca seluruh file 
	*/
	public void read() {
		System.out.println("reading file");
		nBrs = sc.nextInt();
		nKol = sc.nextInt();
		sc.nextLine();

		nCellType = sc.nextInt();
		sc.nextLine();

		listCellType = new String[nCellType];
		listCellSimbol = new char[nCellType];

		for(int i=0; i<nCellType; i++) {
			listCellSimbol.add(i, sc.next().charAt(0));
			listCellType.add(i, sc.next());
			sc.nextLine();
		}


		maps = new char[nBrs][nKol];
		for(int i=0; i<nBrs; i++) {
			//for (int j=0; j<nKol; j++) {
				String s = sc.next();
				char[] c = s.toCharArray();
				maps[i] = c;
				
				for (int j=0;j<nKol;j++) System.out.print(maps[i][j]);
				System.out.println();
				// cout << maps[i][j];
			//}

			sc.nextLine();
		}

		nCage = sc.nextInt();

		listCageSimbol = new char[nCage];
		listCagetype = new String[nCage];

		for(int i=0; i<nCage; i++){
			listCageSimbol.add(sc.next().charAt(0));
			listCagetype.add(sc.next());
			listNCageArea.add(sc.nextInt());
			sc.nextLine();
			//System.out.println(listCageSimbol[i]);
			//System.out.println(listCagetype[i]);
			//System.out.println(listNCageArea[i]);
		}

		// cout <<"sum area = "<< getSumCageArea() << endl;
		listNAnimal = new int[nCage];
		listPos = new int[getSumCageArea()][2];

		
		int c=0;
		int d=0;

		for(int i=0; i<nCage; i++) {
			for(int j=0; j<getNCageArea(i); j++) {
				listPos.add(new ArrayList<Integer>(2));
				listPos.get(c).add(sc.nextInt());
				listPos.get(c).add(sc.nextInt());
				sc.nextLine();
				c++;
			}
			listNAnimal.add(d,sc.nextInt());
			d++;
		}

		sc.close();
	}

	/**
	* getter. Mendapatkan total nilai cageArea
	*
	* @return sum
	*/
	public int getSumCageArea() {
		int sum=0;
		for (int i=0; i<nCage; i++){
			sum += listNCageArea[i];	
		}
		return sum;
	}

	/**
	* getter. Mendapatkan nilai baris area Zoo
	*
	* @return nBrs
	*/
	public int getNBrs() {
		return nBrs;
	}

	/**
	* getter. Mendapatkan nilai kolom area Zoo
	*
	* @return nKol
	*/
	public int getNKol() {
		return nKol;
	}

	/**
	* getter. Mendapatkan jumlah tipe Cell yang ada
	*
	* @return nCellType
	*/
	public int getNCellType() {
		return nCellType;
	}

	/**
	* getter. Mendapatkan jumlah Cage yang akan dibuat
	*
	* @return nCage
	*/
	public int getNCage() {
		return nCage;
	}


	/**
	* getter. Mendapatkan tipe Cell ke i
	*
	* @param i Index tipe Cell yang akan dikembalikan
	* @return listCellType[i]
	*/
	public String getCellType(int i) {
		return listCellType[i];
	}

	/**
	* getter. Mendapatkan simbol Cell ke i
	* 
	* @param i Index simbol Cell yang akan dikembalikan
	* @return listCellSimbol[i]
	*/
	public char getCellSimbol(int i) {
		return listCellSimbol[i];
	}

	/**
	* getter. Mendapatkan simbol Cell pada maps[i][j]
	*
	* @param i Index baris maps
	* @param j Indeks kolom maps
	* @return maps[i][j]
	*/
	public char getMaps(int i, int j) {
		return maps[i][j];
	}

	/**
	* getter. Mendapatkan tipe Cage ke i
	*
	* @param i Index tipe Cage yang akan dikembalikan
	* @return listCagetype[i]
	*/
	public String getCageType(int i) {
		return listCagetype[i];
	}

	/**
	* @brief getter. Mendapatkan simbol Cage ke i
	* @param i Index simbol Cage yang akan dikembalikan
	* @return listCageSimbol[i]
	*/
	public char getCageSimbol(int i) {
		return listCageSimbol[i];
	}

	/**
	* @brief getter. Mendapatkan area Cage ke i
	* @param i Index area Cage yang akan dikembalikan
	* @return listNCageArea[i]
	*/
	public int getNCageArea(int i) {

		return listNAnimal[i];

	}

	/**
	* @brief getter. Mendapatkan jumlah Animal ke i
	* @param i Index jumlah Animal yang akan dikembalikan
	* @return listNAnimal[i]
	*/
	public int getNAnimal(int i) {
		return listNAnimal[i];
	}

	/**
	* @brief getter. Mendapatkan posisi X Cell Cage ke i
	* @param i Index posisi X Cell Cage yang akan dikembalikan
	* @return listPos[i][0]
	*/
	public int getPosX(int i) {
		return listPos[i][0];
	}

	/**
	* @brief getter. Mendapatkan posisi Y Cell Cage ke i
	* @param i Index posisi Y Cell Cage yang akan dikembalikan
	* @return listPos[i][1]
	*/
	public int getPosY(int i) {
		return listPos[i][1];
	}
}

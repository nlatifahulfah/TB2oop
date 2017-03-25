// File : FileReader.java
// PIC : Denita Hanna Widiasuti - 13514008

/**
 *
 * @author Denita Hanna Widiastuti - 13514008
 */
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
	private int nbrs; 	/**< nbrs adalah jumlah baris area Zoo, */
	private int nkol;	/**	nkol adalah jumlah kolom area Zoo */
	private int nCellType; /**< nCellType adalah jumlah tipe Cell yang ada */
	private List<String> listCellType = new ArrayList<String>(); 
				/**< listCellType adalah list nama tipe Cell:
								airhabitat
								waterhabitat
								landhabitat
								road
								park
								restourant 
								entrance
								exit*/
	private List<Character> listCellSimbol = new ArrayList<Character>(); 
				/**< listCellSimbol adalah list karakter simbol Cell
								# airhabitat
								~ waterhabitat
								@ landhabitat
								- road
								* park
								$ restourant 
								\ entrance
								/ exit*/
	private List<List<Character>> maps = new ArrayList<List<Character>>(); /**< peta zoo */
	private int nCage; /**< jumlah Cage yang akan dibangun */
	private List<Character> listCageSimbol = new ArrayList<Character>(); /**< listCageSimbol adalah list karakter simbol Cage */
	private List<String> listCageType = new ArrayList<String>();  /**< listCageType adalah list tipe habitat Cage */
	private List<Integer> listNCageArea = new ArrayList<Integer>();  /**< listNCageArea adalah jumlah Cell yang akan dibangun pada masing2 Cage */
	private List<Integer> listNAnimal = new ArrayList<Integer>();  /**< listNAnimal adalah jumlah animal yang akan diciptakan pada masing2 Cage*/
	private List<List<Integer>> listPos = new ArrayList<List<Integer>>(); /**< listPos adalah list dari posisi Cage yang akan dibangun */

	/**
	* Membaca file eksternal 
	*
	* @param fileName Nama file eksternal yang akan dibaca
	*/
	public void FileReader(String fileName) {
		URL path = ClassLoader.getSystemResource(fileName);
		file = new File(path.toString());
		try (Scanner sc = new Scanner(file);) {
			read();
		} catch (FileNotFoundException e) {
			;
		}
	}

	/**
	* Membaca seluruh file 
	*/
	public void read() {		
		nbrs = sc.nextInt();
		nkol = sc.nextInt();
		sc.nextLine();
		// cout<<nbrs<<" "<< nkol<<endl;

		nCellType = sc.nextInt();
		sc.nextLine();
		String listCellType[] = new String[nCellType];
		char listCellSimbol[] = new char[nCellType];
		for(int i=0; i<nCellType; i++) {
			listCellSimbol[i] = sc.next().charAt(0);
			listCellType[i] = sc.next();
			sc.nextLine();
			// cout << listCellSimbol[i] << " " << listCellType[i] <<endl;
		}

		char maps[][] = new char[nbrs][nkol];
		for(int i=0; i<nbrs; i++) {
			for (int j=0; j<nkol; j++) {
				maps[i][j] = sc.next().charAt(0);
				// cout << maps[i][j];
			}
			sc.nextLine();
			// cout << endl;
		}

		nCage = sc.nextInt();
		char listCageSimbol[] = new char[nCage];
		String listCageType[] = new String[nCage];
		int listNCageArea[] = new int[nCage];
		for(int i=0; i<nCage; i++){
			listCageSimbol[i] = sc.next().charAt(0);
			listCageType[i] = sc.next();
			listNCageArea[i] = sc.nextInt();
			sc.nextLine();
		}

		// cout <<"sum area = "<< GetSumCageArea() << endl;
		int listNAnimal[] = new int[nCage];
		int listPos[][] = new int[getSumCageArea()][2];
		
		int c=0;
		int d=0;
		for(int i=0; i<nCage; i++) {
			for(int j=0; j<listNCageArea[i]; j++) {
				listPos[c][0] = sc.nextInt();
				listPos[c][1] = sc.nextInt();
				sc.nextLine();
				// cout << listPos[c][0] <<" "<< listPos[c][1] << endl;
				c++;
			}
			listNAnimal[d] = sc.nextInt();
			// cout << "nAnimal:" <<listNAnimal[d] <<endl;
			d++;
		}

		sc.close();
	}

	/**
	* Getter. Mendapatkan total nilai cageArea
	*
	* @return sum
	*/
	public int getSumCageArea() {
		int sum=0;
		for (int i=0; i<listNCageArea.size(); i++){
			sum += listNCageArea.get(i);	
		}
		return sum;
	}

	/**
	* Getter. Mendapatkan nilai baris area Zoo
	*
	* @return nbrs
	*/
	public int getNBrs() {
		return nbrs;
	}

	/**
	* Getter. Mendapatkan nilai kolom area Zoo
	*
	* @return nkol
	*/
	public int getNKol() {
		return nkol;
	}

	/**
	* Getter. Mendapatkan jumlah tipe Cell yang ada
	*
	* @return nCellType
	*/
	public int getNCellType() {
		return nCellType;
	}

	/**
	* Getter. Mendapatkan jumlah Cage yang akan dibuat
	*
	* @return nCage
	*/
	public int getNCage() {
		return nCage;
	}


	/**
	* Getter. Mendapatkan tipe Cell ke i
	*
	* @param i Index tipe Cell yang akan dikembalikan
	* @return listCellType[i]
	*/
	public String getCellType(int i) {
		return listCellType.get(i);
	}

	/**
	* Getter. Mendapatkan simbol Cell ke i
	* 
	* @param i Index simbol Cell yang akan dikembalikan
	* @return listCellSimbol[i]
	*/
	public char getCellSimbol(int i) {
		return listCellSimbol.get(i);
	}

	/**
	* Getter. Mendapatkan simbol Cell pada maps[i][j]
	*
	* @param i Index baris maps
	* @param j Indeks kolom maps
	* @return maps[i][j]
	*/
	public char getMaps(int i, int j) {
		return maps.get(i).get(j);
	}

	/**
	* Getter. Mendapatkan tipe Cage ke i
	*
	* @param i Index tipe Cage yang akan dikembalikan
	* @return listCageType[i]
	*/
	public String getCageType(int i) {
		return listCageType.get(i);
	}

	/**
	* @brief Getter. Mendapatkan simbol Cage ke i
	* @param i Index simbol Cage yang akan dikembalikan
	* @return listCageSimbol[i]
	*/
	public char GetCageSimbol(int i) {
		return listCageSimbol.get(i);
	}

	/**
	* @brief Getter. Mendapatkan area Cage ke i
	* @param i Index area Cage yang akan dikembalikan
	* @return listNCageArea[i]
	*/
	public int GetNCageArea(int i) {
		return listNAnimal.get(i);
	}

	/**
	* @brief Getter. Mendapatkan jumlah Animal ke i
	* @param i Index jumlah Animal yang akan dikembalikan
	* @return listNAnimal[i]
	*/
	public int GetNAnimal(int i) {
		return listNAnimal.get(i);
	}

	/**
	* @brief Getter. Mendapatkan posisi X Cell Cage ke i
	* @param i Index posisi X Cell Cage yang akan dikembalikan
	* @return listPos[i][0]
	*/
	public int GetPosX(int i) {
		return listPos.get(i).get(0);
	}

	/**
	* @brief Getter. Mendapatkan posisi Y Cell Cage ke i
	* @param i Index posisi Y Cell Cage yang akan dikembalikan
	* @return listPos[i][1]
	*/
	public int GetPosY(int i) {
		return listPos.get(i).get(1);
	}
}
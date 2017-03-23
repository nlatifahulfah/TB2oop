// File : FileReader.java
// PIC : Denita Hanna Widiasuti - 13514008

import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.List;

public class FileReader {
	private FileInputStream file;  // File eksternal yang akan dibaca
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
		file = new FileInputStream(fileName);
		file.open();
		Read();
		file.close();
	}

	/**
	* @brief Membaca seluruh file 
	*/
	public void read() {
		file >> nbrs >> nkol;
		// cout<<nbrs<<" "<< nkol<<endl;

		file >> nCellType;
		String listCellType[] = new String[nCellType];
		char listCellSimbol[] = new char[nCellType];
		for(int i=0; i<nCellType; i++) {
			file >> listCellSimbol[i] >> listCellType[i];
			// cout << listCellSimbol[i] << " " << listCellType[i] <<endl;
		}

		char maps[][] = new char[nbrs][nkol];
		for(int i=0; i<nbrs; i++) {
			for(int j=0; j<nkol; j++) {
				file >> maps[i][j];
				// cout << maps[i][j];
			}
			// cout << endl;
		}

		file >> nCage;
		char listCageSimbol[] = new char[nCage];
		String listCageType[] = new String[nCage];
		int listNCageArea[] = new int[nCage];
		for(int i=0; i<nCage; i++){
			file >> listCageSimbol[i];
			file >> listCageType[i];
			file >> listNCageArea[i];

		}

		// cout <<"sum area = "<< GetSumCageArea() << endl;
		int listNAnimal[] = new int[nCage];
		int listPos[][] = new int[GetSumCageArea()][2];
		
		int c=0;
		int d=0;
		for(int i=0; i<nCage; i++) {
			for(int j=0; j<listNCageArea[i]; j++) {
				file >> listPos[c][0] >> listPos[c][1];
				// cout << listPos[c][0] <<" "<< listPos[c][1] << endl;
				c++;
			}
			file >> listNAnimal[d];
			// cout << "nAnimal:" <<listNAnimal[d] <<endl;
			d++;
		}
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
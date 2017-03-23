// File : MatrixCell.java
// PIC : Denita Hanna Widiastuti - 13514008

public class MatrixCell {
	private Cell matrix[][];
	private int N_BRS;
	private int N_KOL;

	/**
	* Ctor. Menginisiasi matriks 
	*
	* @param brs Jumlah baris pada matrix
	* @param kol Jumlah kolom pada matrix
	*/
	public void MatrixCell(int brs, int kol) {
		N_BRS = brs;
		N_KOL = kol;
		Cell matrix[][] = new Cell [N_BRS][N_KOL];
	}

	/**
	* Getter dari isi cell pada koodinat tertentu
	*
	* @param i Koordinat sumbu X dari cell
	* @param j Koordinat sumbu Y dari cell
	*/	
	public Cell getCell(int i, int j) {
		return matrix[i][j];
	}

	/**
	* Setter. Memasukkan nilai cell dari parameter input pada koordinat yang diinginkan
	*
	* @param C Cell yang diinputkan
	* @param a Koordinat sumbu X dari cell
	* @param b Koordinat sumbu Y dari cell
	*/	
	public void setCell(Cell C, int a, int b) {
		matrix[a][b] = C;
	}

	/**
	* Getter jumlah baris matrix
	*
	* @return N_BRS
	*/	
	public int getNBRS() {
		return N_BRS;
	}

	/**
	* Getter jumlah kolom matrix
	*
	* @return N_KOL
	*/	
	public int getNKOL() {
		return N_KOL;
	}
}
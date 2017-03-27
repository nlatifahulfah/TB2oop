// File : MatrixCell.java
// PIC : Denita Hanna Widiastuti - 13514008

/**
 *
 * @author Denita Hanna Widiastuti - 13514008
 */
public class MatrixCell {
	private Cell matrix[][];
	private int nBrs;
	private int nKol;

	/**
	* Ctor. Menginisiasi matriks 
	*
	* @param brs Jumlah baris pada matrix
	* @param kol Jumlah kolom pada matrix
	*/
	public MatrixCell(int brs, int kol) {
		nBrs = brs;
		nKol = kol;
		Cell matrix[][] = new Cell [nBrs][nKol];
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
	* @return nBrs
	*/	
	public int getNBrs() {
		return nBrs;
	}

	/**
	* Getter jumlah kolom matrix
	*
	* @return nKol
	*/	
	public int getNKol() {
		return nKol;
	}
}

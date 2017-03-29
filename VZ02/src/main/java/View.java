// File	: View.java
// PIC	: Hasna Nur Karimah - 13514106

/**
 *
 * @author Hasna Nur Karimah - 13514106
 */
public class View {
	private char[][] val;
	private final int nBrs;
	private final int nKol;
	
	/**
	* @brief Constructor
	* @param len Nilai nBrs
	* @param wid Nilai nKol
	*/
	public View(int len, int wid) {
		nBrs = len;
		nKol = wid;
		val = new char [nBrs][nKol];
		for (int i=0; i<nBrs; i++) {
			for (int j=0; j<nKol; j++)
				val[i][j] = ' ';
		}
	}

	/**
	* @brief Mengubah nilai val[i][j] menjadi c
	* @param i Index baris nilai yang ingin diubah
	* @param j Index kolom nilai yang ingin diubah
	*/
	public void setVal(int i, int j, char c) {
		val[i][j] = c;
	}

	/**
	* @brief Mendapatkan nilai val[_x][_y]
	* @param _x Index baris nilai yang ingin didapatkan
	* @param _y Index kolom nilai yang ingin didapatkan
	* @return val[_x][_y]
	*/
	public char getVal(int x, int y) {
		return val[x][y];
	}

	/**
	* @brief Mendapatkan nilai baris
	* @return nBrs
	*/
	public int getNBrs() {
		return nBrs;
	}
	
	/**
	* @brief Mendapatkan nilai kolom
	* @return nKol
	*/
	public int getNKol() {
		return nKol;
	}
	
	/**
	* @brief Mencetak seluruh karakter yang ada
	*/
	public void printView() {
		for (int i=0; i<nBrs; i++) {
			for (int j=0; j<nKol; j++) {
				System.out.print(val[i][j]);
			}
			System.out.println();
		}	
	}
	/**
	* @brief Mencetak karakter pada area mulai dari titik 
	* kiri atas sampai kanan bawah
	*/
	public void printView(int kiri,int atas,int kanan,int bawah) {
		for (int i=atas; i<bawah; i++) {
			for (int j=kiri; j<kanan; j++) {
				System.out.print(val[i][j]);
			}
			System.out.println();
		}	
	}
		
}

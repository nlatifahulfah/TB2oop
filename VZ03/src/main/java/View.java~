// File	: View.java
// PIC	: Hasna Nur Karimah - 13514106

/**
 *
 * @author Hasna Nur Karimah - 13514106
 */
public class View {
	private char[][] val;
	private final int NBRS;
	private final int NKOL;
	
	
	public View(int len, int wid) {
		NBRS = len;
		NKOL = wid;
		val = new char [NBRS][NKOL];
		for (int i=0; i<NBRS; i++) {
			for (int j=0; j<NKOL; j++)
				val[i][j] = ' ';
		}
	}


	public char getVal(int x, int y) {
		return val[x][y];
	}

	public void setVal(int i, int j, char c) {
		val[i][j] = c;
	}

	public int getNBrs() {
		return NBRS;
	}

	public int getNKol() {
		return NKOL;
	}

	public void printView() {
		for (int i=0; i<NBRS; i++) {
			for (int j=0; j<NKOL; j++) {
				System.out.print(val[i][j]);
			}
			System.out.println();
		}	
	}

	public void printView(int kiri,int atas,int kanan,int bawah) {
		for (int i=atas; i<bawah; i++) {
			for (int j=kiri; j<kanan; j++) {
				System.out.print(val[i][j]);
			}
			System.out.println();
		}	
	}
		
}

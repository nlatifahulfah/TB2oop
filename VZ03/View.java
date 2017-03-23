public class View {
	private char** val;
	private const int NBRS;
	private const int NKOL;
	
	
	public View(int len, int wid) : NBRS(len), NKOL(wid) {
		val = new char *[NBRS];
		for (int i=0; i<NBRS; i++)
			val[i] = new char [NKOL];

		for (int i=0; i<NBRS; i++) {
			for (int j=0; j<NKOL; j++)
				val[i][j] = ' ';
		}
	}


	public char getVal(int _x, int _y) {
		return val[_x][_y];
	}

	public void setVal(int i, int j, char c) {
		val[i][j] = c;
	}

	public int getNBRS() {
		return NBRS;
	}

	public int getNKOL() {
		return NKOL;
	}

	public void printView() {
		for (int i=0; i<NBRS; i++) {
			for (int j=0; j<NKOL; j++) {
				System.out.print(val[i][j]);
			}
			System.out.println;
		}	
	}

	public void printView(int kiri,int atas,int kanan,int bawah) {
		for (int i=atas; i<bawah; i++) {
			for (int j=kiri; j<kanan; j++) {
				System.out.print(val[i][j]);
			}
			System.out.println;
		}	
	}
		
}

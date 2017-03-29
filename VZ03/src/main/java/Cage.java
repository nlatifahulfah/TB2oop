// File : Cage.java
// PIC : Nur Latifah Ulfah - 13514015

/**
 *
 * @author Nur Latifah Ulfah - 13514015
 */

public class Cage implements Renderable {
	private char simbol; /**< simbol adalah karakter simbol dari Cage */
	private String tipeHabitat; /**< tipeHabitat adalah tipe habitat tempat Cage didirikan */
	private final int cageArea=50; /**< cageArea adalah jumlah petak maksimal yang dapat dibagun */
	private int nArea; /**< nArea adalah jumlah petak yang dibangun */
	private int nAnimal; /**< nAnimal adalah jumlah Animal dalam Cage */
	private Cell listOfCagePosition[]; /**< listOfCagePosition adalah list posisi petak2 tempat Cage didirikan*/
	private Animal animals[]; /**< animals adalah list Animal yang ada dalam Cage */

	/**
	* Constructor. Membangun sebuah Cage dengan tipeHabitat dan simbol tertentu
	* 
	* @param simbol Simbol dari cage
	* @param tipehabitat Tipe habitat cage
	* @param cageArea Luas cage / jumlah cell
	*/
	public Cage(char simbol, String tipeHabitat) {
		this.simbol = simbol;
		this.tipeHabitat = tipeHabitat;

		listOfCagePosition = new Cell[cageArea];
		animals = new Animal[30*cageArea/100];
		nAnimal = 0;
		nArea = 0;
	}

	/**
	* Getter cageArea. Mendapatkan banyak petak maksimal yang dapat dibangun
	* 
	* @return cageArea 
	*/
	public int getCageArea() {
		return cageArea;
	}

	/**
	* Getter nArea. Mendapatkan jumlah petak yang telah dibangun.
	* 
	* @return nArea
	*/
	public int getNArea() {
		return nArea;
	}

	/**
	* Getter nAnimal. Mendapatkan jumlah Animal yang terdapat pada cage.
	* 
	* @return nAnimal
	*/
	public int getNAnimal() {
		return nAnimal;
	}

	/**
	* Getter tipeHabitat. Mendapatkan tipe habitat Cage.
	* 
	* @return tipeHabitat
	*/
	public String getTipeHabitat() {
		return tipeHabitat;
	}

	/**
	* Getter Cage Position. Mendapatkan listOfCagePosition[i]
	* 
	* @param i index listOfCagePosition
	* @return listOfCagePosition[i]
	*/
	public Cell getCagePosition(int i) {
		return listOfCagePosition[i];
	}

	/**
	* Getter Animal. Mendapatkan Animal pada indeks i (animals[i]).
	* 
	* @param i Index Animal yang akan diambil
	* @return animals[i]
	*/
	public Animal getAnimal(int i) {
		return animals[i];
	}

	/**
	* Menghitung max animal. Maksimal animal dalam cage = 30% dari nArea.
	* 
	* @return 30%*cageArea;
	*/
	public int getMaxAnimal() {
		return 30*nArea/100;
	}

	/**
	* Menghitung total makanan yang dibutuhkan dalam 1 Cage. 
	* Menjumlahkan makanan yang dibutuhkan seluruh Animal dalam Cage.
	* 
	* @return total makanan
	*/
	public int getTotalMakanan() {
		int total_makanan = 0;
		for(int i = 0; i < nAnimal; i++) {
			total_makanan = total_makanan + animals[i].getBobot();
		}
		return total_makanan;
	}


	/**
	* Setter listOfCagePosition.
	* Menambahkan posisi cell tempat didirikannya cage.
	*
	* @param position Posisi cage
	*/
	public void addCagePosition(Cell position) {
		if (nArea < getCageArea()) {
			listOfCagePosition[nArea] = position;	
			nArea++;
		}
	}

	/**
	* Setter animals.
	* Menambahkan Animal dalam cage jika masih bisa ditambahkan.
	* Harus dipastikan jumlah Animal tidak melebihi kapasitasnya
	* 
	* @param anim Animal yang akan ditambahkan
	*/
	public void addAnimal(Animal anim) {
		if (nAnimal < getMaxAnimal()) {
			//System.out.println("bisa nambah");
			animals[nAnimal] = anim;
			nAnimal++;
			
		}
	}

	/**
	* Menentukan apakah suatu cell cage telah ditempati animal 
	* atau belum
	* 
	* @param c Cell
	* @return true jika posisi c belum ditempati animal,
	*		      false jika sebaliknya
	*/
	public boolean isPositionEmpty(Cell c) {
		int i=0;
		boolean empty = true;
		while (i<nAnimal && empty){
			if ((animals[i].getX() == c.getX()) && (animals[i].getY() == c.getY())) {
				empty = false;
				
			} else {
				i++;	
			}
			
		}

		return empty;
	}

	public boolean isPositionInCage(int x, int y) {
		int i = 0;
		boolean found = false;
		while (i < nArea && !found) {
			if (listOfCagePosition[i].getX() == x && listOfCagePosition[i].getY() == y) {
				found = true;
			}
			i++;
		}
		return found;
	}

	/**
	* Getter SIMBOL.
	* Mengembalikan nilai SIMBOL.
	* 
	* @return SIMBOL
	*/
	public char render() {
		return simbol;
	}


}

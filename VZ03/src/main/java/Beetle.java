// File	: Beetle.java
// PIC	: Hasna Nur Karimah - 13514106

/**
 *
 * @author  Hasna Nur Karimah - 13514106
 */
public class Beetle extends Animal implements FlyingAnimal, Herbivora {
	private final String TIPEANIMAL = "beetle";
	private final char SIMBOL = 'q';
	private int bobot;
	private String tipeHabitat[] = {"air"};
	private String musuh[] = {"owl", "bee"};

	/**
	* Constructor
	* 
	* @param x posisi x awal Beetle
	* @param y posisi y awal Beetle
	*/
	public Beetle(int x, int y) {
		super(x, y);
		bobot = 2;
	}
	
	/**
	* Menambahkan bobot satu satuan
	*/
	public void addBobot() {
		bobot++;
	}

	/**
	* Mendapatkan nilai bobot dari Beetle
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}

	/**
	* Mendapatkan simbol dari Beetle
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}

	/**
	* Mendapatkan musuh ke i dari Beetle
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Beetle
	*
	* @return musuh[i]
	*/
	public String getMusuh(int i) {
		return musuh[i];
	}

	/**
	* Mendapatkan tipe Animal (nama spesies)
	*
	* @return tipeAnimal
	*/
	public String getTipeAnimal() {
		return TIPEANIMAL;
	}

	/**
	* Mendapatkan reaksi Beetle saat berinteraksi
	* dengan pengunjung
	*
	* @return "kepakkepak"
	*/
	@Override
	public String interact() {
		return "kepakkepak"; 
	}

	/**
	* Mendapatkan simbol dari Beetle
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}

	/**
	* Mendapatkan tipeHabitat dari Beetle
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; 
	}
}

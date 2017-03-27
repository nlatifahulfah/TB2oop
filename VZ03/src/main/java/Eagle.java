// File	: Eagle.java
// PIC	: Hasna Nur Karimah - 13514106

/**
 *
 * @author  Hasna Nur Karimah - 13514106
 */
public class Eagle extends Animal implements FlyingAnimal, Karnivora {
	private final String TIPEANIMAL = "eagle";
	private final char SIMBOL = 'a';
	private int bobot;
	private String tipeHabitat[] = {"air"};
	private String musuh[] = {"bird", "butterfly"};

	/**
	* Constructor
	* 
	* @param x posisi x awal Eagle
	* @param y posisi y awal Eagle
	*/
	public Eagle(int x, int y) {
		super(x, y);
		bobot = 12;
	}
	
	/**
	* Menambahkan bobot satu satuan
	*/
	@Override
	public void addBobot() {
		bobot++;
	}

	/**
	* Mendapatkan nilai bobot dari Eagle
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}

	/**
	* Mendapatkan simbol dari Eagle
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}

	/**
	* Mendapatkan musuh ke i dari Eagle
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Eagle
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
	* Mendapatkan reaksi Eagle saat berinteraksi
	* dengan pengunjung
	*
	* @return "gakgak"
	*/
	@Override
	public String interact() {
		return "gakgak"; 
	}

	/**
	* Mendapatkan simbol dari Eagle
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}

	/**
	* Mendapatkan tipeHabitat dari Eagle
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; 
	}
}

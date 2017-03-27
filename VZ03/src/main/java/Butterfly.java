// File	: Butterfly.java
// PIC	: Hasna Nur Karimah - 13514106

/**
 *
 * @author  Hasna Nur Karimah - 13514106
 */
public class Butterfly extends Animal implements FlyingAnimal, Herbivora {
	private final String TIPEANIMAL = "butterfly";
	private final char SIMBOL = 't';
	private int bobot;
	private String tipeHabitat[] = {"air"};
	private String musuh[] = {"bird", "eagle"};

	/**
	* Constructor
	* 
	* @param x posisi x awal Butterfly
	* @param y posisi y awal Butterfly
	*/
	public Butterfly(int x, int y) {
		super(x, y);
		bobot = 3;
	}
	
	/**
	* Menambahkan bobot satu satuan
	*/
	@Override
	public void addBobot() {
		bobot++;
	}

	/**
	* Mendapatkan nilai bobot dari Butterfly
	*
	* @return bobot saat ini
	*/
	@Override
	public int getBobot() {
		return bobot;
	}

	/**
	* Mendapatkan simbol dari Butterfly
	*
	* @return simbol
	*/
	public char getSimbol() {
		return SIMBOL;
	}

	/**
	* Mendapatkan musuh ke i dari Butterfly
	* Musuh merupakan Animal lain yang tidak bisa tinggal
	* dalam satu kandang dengan Butterfly
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
	* Mendapatkan reaksi Butterfly saat berinteraksi
	* dengan pengunjung
	*
	* @return "flyfly"
	*/
	@Override
	public String interact() {
		return "flyfly"; 
	}

	/**
	* Mendapatkan simbol dari Butterfly
	* 
	* @return simbol
	*/
	@Override
	public char render() {
		return SIMBOL;
	}

	/**
	* Mendapatkan tipeHabitat dari Butterfly
	* 
	* @return tipeHabitat
	*/
	@Override
	public String[] getTipeHabitat() {
		return tipeHabitat; 
	}
}
